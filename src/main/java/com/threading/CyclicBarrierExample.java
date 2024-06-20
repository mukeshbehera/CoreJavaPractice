package com.threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All threads have reached the barrier point");
        });

        Runnable worker = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                barrier.await(); // Threads wait at the barrier until all threads reach this point
                System.out.println(Thread.currentThread().getName() + " has passed the barrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        // Start three worker threads
        for (int i = 0; i < 3; i++) {
            new Thread(worker).start();
        }
    }
}