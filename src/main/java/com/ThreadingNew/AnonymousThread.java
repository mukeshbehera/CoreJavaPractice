package com.ThreadingNew;

public class AnonymousThread {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello "+Thread.currentThread().getName()+":"+i);
                    try{
                        Thread.sleep(100);
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                
            }            
        });

        t1.setName("T1");
        t1.start();
    }
}
