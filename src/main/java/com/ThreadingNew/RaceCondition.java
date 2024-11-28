package com.ThreadingNew;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    // declare counter as
    // private AtomicInteger count = new AtomicInteger(0);
    private int count;

    // or declare increment method as synchronized to get correct output
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<10000; i++){
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<10000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
