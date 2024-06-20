package com.threading;

import java.util.LinkedList;

class SharedBuffer{
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        if (buffer.size() == capacity){
            // Buffer is full, wait for consumer to consume
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: "+item);

        // Notify waiting consumers that there is an item available
        notifyAll();
    }

    public synchronized int consumer() throws InterruptedException {
        while (buffer.isEmpty()){
            // Buffer is empty, wait for producer to produce
            wait();
        }
        int consumed = buffer.removeFirst();
        System.out.println("Consumed: "+consumed);

        // Notify waiting producers that there is space in the buffer
        notifyAll();
        return consumed;
    }
}

public class ProducerConsumerWaitNotifyExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(2);

        //Producer Thread (anonymous)
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=0; i<5; i++){
                        buffer.produce(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //Consumer Thread (anonymous)
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=0; i<5; i++){
                        buffer.consumer();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
