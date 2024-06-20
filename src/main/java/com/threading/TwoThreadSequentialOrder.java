package com.threading;

public class TwoThreadSequentialOrder extends Thread{

    static int number = 0;

    @Override
    public void run() {
        synchronized (TwoThreadSequentialOrder.class) {
            while (number <= 50) {
                System.out.println(Thread.currentThread().getName() + ": " + number++);
                TwoThreadSequentialOrder.class.notify(); // Notify the waiting thread
                try {
                    if (number <= 50) {
                        TwoThreadSequentialOrder.class.wait(); // Release the lock and wait for the other thread to notify
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        TwoThreadSequentialOrder t1 = new TwoThreadSequentialOrder();
        t1.setName("Thread 1");
        TwoThreadSequentialOrder t2 = new TwoThreadSequentialOrder();
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
