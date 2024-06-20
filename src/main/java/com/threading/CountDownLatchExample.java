package com.threading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName()+" is working");
            latch.countDown();
        };


        // start 3 worker threads
        for (int i=0; i<3; i++){
            new Thread(worker).start();
        }

        // Main thread waits until the count becomes zero
        latch.await();

        System.out.println("All workers have finished their work.");
    }
}
