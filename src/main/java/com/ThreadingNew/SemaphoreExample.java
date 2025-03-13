package com.ThreadingNew;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int MAX_THREADS = 3;
    private static final Semaphore semaphore = new Semaphore(MAX_THREADS);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new Task(i));
            thread.start();
        }
    }

    static class Task implements Runnable {
        private final int taskId;

        Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            try {
                System.out.println("Task " + taskId + " is waiting to acquire the semaphore.");
                semaphore.acquire();
                System.out.println("Task " + taskId + " has acquired the semaphore.");
                Thread.sleep(2000);
                System.out.println("Task " + taskId + " is releasing the semaphore.");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * output:
 * Task 1 is waiting to acquire the semaphore.
 * Task 4 is waiting to acquire the semaphore.
 * Task 3 is waiting to acquire the semaphore.
 * Task 3 has acquired the semaphore.
 * Task 2 is waiting to acquire the semaphore.
 * Task 5 is waiting to acquire the semaphore.
 * Task 4 has acquired the semaphore.
 * Task 1 has acquired the semaphore.
 * Task 3 is releasing the semaphore.
 * Task 1 is releasing the semaphore.
 * Task 4 is releasing the semaphore.
 * Task 5 has acquired the semaphore.
 * Task 2 has acquired the semaphore.
 * Task 5 is releasing the semaphore.
 * Task 2 is releasing the semaphore.
 */