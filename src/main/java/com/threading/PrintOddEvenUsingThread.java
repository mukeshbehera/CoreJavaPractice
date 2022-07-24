package com.threading;


public class PrintOddEvenUsingThread {

	synchronized public static void printOddEvenNumbers() {
		System.out.println("Printing Even Numbers: ");
		for(int i=1; i<=30; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Printing Odd Numbers: ");
		for(int i=1; i<=30; i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
	}
	
	//Main Method
	public static void main(String[] args) {
		//Thread1
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				PrintOddEvenUsingThread.printOddEvenNumbers();
			}
		}, "Thread1");
		
		//Thread2
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				PrintOddEvenUsingThread.printOddEvenNumbers();
			}
		}, "Thread2");
		
		
		thread1.start();
		thread2.start();
	}
}


/**
 * 	Output:  Printing Even Numbers: 
 * 			 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
 * 			 Printing Odd Numbers: 
 * 			 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 
 * 
 * 			 Printing Even Numbers: 
 * 			 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
 * 			 Printing Odd Numbers: 
 * 			 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 
 *
 */