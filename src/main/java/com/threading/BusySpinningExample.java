package com.threading;

public class BusySpinningExample {
    private static volatile boolean resourceAvailable = false;

    public static void main(String[] args) {
        // Worker thread
        Thread workerThread = new Thread(() -> {
            System.out.println("Worker Thread: Waiting for the resource");
            while (!resourceAvailable) {
                // Busy spin: Keep checking the condition without yielding the CPU
//                Thread.onSpinWait(); // To improve the performance of spin-waiting loops by providing a hint to the
//                runtime. This hint allows the runtime to potentially optimize the thread's behavior in a spin-wait loop, such as yielding the CPU or performing other optimizations.
            }
            System.out.println("Worker Thread: Resource is now available");
        });

        // Main thread
        System.out.println("Main Thread: Making the resource available");
        resourceAvailable = true;

        // Start the worker thread
        workerThread.start();

        try {
            // Wait for the worker thread to finish
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: Done");
    }
}
