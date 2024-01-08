package com.threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBufferReentrantLock {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public SharedBufferReentrantLock(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                // Buffer is full, wait for consumer to consume
                notFull.await();
            }

            buffer.add(item);
            System.out.println("Produced: " + item);

            // Notify waiting consumers that there is an item available
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public int consume() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.isEmpty()) {
                // Buffer is empty, wait for producer to produce
                notEmpty.await();
            }

            int item = buffer.remove();
            System.out.println("Consumed: " + item);

            // Notify waiting producers that there is space in the buffer
            notFull.signal();

            return item;
        } finally {
            lock.unlock();
        }
    }
}


public class ProducerConsumerReentrantLock {
    public static void main(String[] args) {
        SharedBufferReentrantLock buffer = new SharedBufferReentrantLock(2);

        //Producer Thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 5; i++) {
                        buffer.produce(i);
                        Thread.sleep(2000); // Simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Consumer Thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 5; i++) {
                        buffer.consume();
                        Thread.sleep(2000); // Simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
