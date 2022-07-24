package com.arrays;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Even: ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%2 == 0)) {
				System.out.print(arr[i]+", ");
			}
		}

		System.out.println("\n");
		System.out.println("Odd: ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%2 != 0)) {
				System.out.print(arr[i]+", ");
			}
		}
	}
}

/*
 *  Output:  Even Numbers: 
 *  		 2, 4, 6, 8, 10, 
 *  
 *  		 Odd Number: 
 *  		 1, 3, 5, 7, 9, 
 */