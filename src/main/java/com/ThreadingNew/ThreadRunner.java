package com.ThreadingNew;

public class ThreadRunner extends Thread{

    
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        
        ThreadRunner tr1 = new ThreadRunner();
        tr1.setName("TR1");
        tr1.start();

        ThreadRunner tr2 =  new ThreadRunner();
        tr2.setName("TR2");
        tr2.start();
    }
}
