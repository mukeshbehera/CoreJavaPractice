package com.threading;

/**
 * Inter-Thread Communication using Wait and Notify
 *
 */
public class WaitNotifyExample {

	
	synchronized public void mrX() {
		String[] strings = {"Hello","How Are You","What is your name","I'm Mr.Y"};
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notify();
		}
	}
	
	synchronized public void mrY() {
		String[] strings = {"Hi","I'm Good","I'm Mr.X, What is your name"};
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notify();
		}
	}
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				new WaitNotifyExample().mrX();
			}
		},"Thread 1");
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				new WaitNotifyExample().mrY();
			}
		},"Thread 2");
		
		thread1.start();
		thread2.start();
	}
}
