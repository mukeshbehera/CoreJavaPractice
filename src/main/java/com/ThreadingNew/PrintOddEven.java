package com.ThreadingNew;

class Printer{
    private final int limit;
    private volatile boolean isOdd = true;

    public Printer(int limit) {
        this.limit = limit;
    }

    synchronized void printOdd() {
        for (int i = 1; i <= limit; i += 2) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);

            isOdd = false;
            notify();
        }
    }

    synchronized void printEven() {
        for (int i = 2; i <= limit; i += 2) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);

            isOdd = true;
            notify();
        }
    }
}

public class PrintOddEven {
    public static void main(String[] args) {
        Printer printer = new Printer(10);

        Thread t1 = new Thread(printer::printEven);
        Thread t2 = new Thread(printer::printOdd);

        t1.start();
        t2.start();
    }
}
