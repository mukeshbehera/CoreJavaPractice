package com.ThreadingNew;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    // declare counter as
    // private AtomicInteger count = new AtomicInteger(0);
    // ReentrantLock lock = new ReentrantLock();

    private int count;

    // or declare increment method as synchronized to get correct output
    public synchronized void increment(){
        count++;
    }

    /*public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }*/

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
