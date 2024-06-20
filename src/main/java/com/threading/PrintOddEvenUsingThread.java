package com.threading;

public class PrintOddEvenUsingThread implements Runnable{

    static int count = 1;

    @Override
    public void run() {
        while (count<=10){
            if (count%2 == 0 && Thread.currentThread().getName().equals("even")){
                synchronized (PrintOddEvenUsingThread.class){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+" Value: "+count);
                    count++;
                    try {
                        PrintOddEvenUsingThread.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if (count%2 != 0 && Thread.currentThread().getName().equals("odd")){
                synchronized (PrintOddEvenUsingThread.class){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+" Value: "+count);
                    count++;
                    PrintOddEvenUsingThread.class.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        new Thread(new PrintOddEvenUsingThread(),"even").start();
        new Thread(new PrintOddEvenUsingThread(),"odd").start();
    }
}
