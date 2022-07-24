package com.threading;

public class InterThreadCommunication2 extends Thread{

	static int x = 1;

	@Override
	public void run() {
		synchronized (this) {
			String[] strings = {"Hi","I'm Good","I'm Mr.X, What is your name"};
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
				notify();
				try {
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		InterThreadCommunication2 t = new InterThreadCommunication2();
		t.start();

		synchronized (t) {
			String[] strings = {"Hello","How Are You","What is your name","I'm Mr.Y"};
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
				try {
					t.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				t.notify();
			}
		}

	}
}
