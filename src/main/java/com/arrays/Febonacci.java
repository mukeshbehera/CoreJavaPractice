package com.arrays;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the no required for febonacci");
		int noOfFebonacci = scanner.nextInt();
		System.out.println("enter first no of febonacci");
		int firstNumber = scanner.nextInt();
		System.out.println("enter second no of febonacci");
		int secondNumber = scanner.nextInt();
		
		scanner.close();
		
		
		
		int[] feb = new int[noOfFebonacci];
		feb[0] = firstNumber;
		feb[1] = secondNumber;
		
		for (int i = 2; i < noOfFebonacci; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		
		// print the data
		for (int feb1 : feb) {
			System.out.print(" " + feb1);
		}
	}
}
