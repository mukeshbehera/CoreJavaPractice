package com.java8features.methodreference;

public class Stuffs {

	public static void doStuffs() {
		System.out.println("I'm doing stuffs");
	}
	
	public static void threadTask() {
		for(int i=0; i<10; i++) {
			System.out.print(i*2+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void printNumbers() {
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
