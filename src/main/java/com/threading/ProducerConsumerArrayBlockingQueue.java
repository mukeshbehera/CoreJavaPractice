package com.threading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerArrayBlockingQueue {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        //Producer Thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Thread.sleep(2000);
                    producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //Consumer Thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Thread.sleep(2000);
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }

    private static void consumer() throws InterruptedException {
        while (true){
            Integer consumed = queue.take();
            System.out.println("Consumed: "+consumed);
        }
    }

    private static void producer() throws InterruptedException {
        Random random = new Random();
        while (true){
            // simulate some work or delay so that
            // Without this sleep, the producer may run very quickly and produce items at a high rate,
            // overwhelming the consumer, and you might not observe the expected synchronized behavior.
            Thread.sleep(2000);
            int produced = random.nextInt(100);
            queue.put(produced);
            System.out.println("Produced: "+produced);
        }
    }
}
