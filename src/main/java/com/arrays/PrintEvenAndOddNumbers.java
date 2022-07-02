package com.arrays;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Even Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2 == 0)) {
				System.out.print(arr[i]+", ");
			}
		}

		System.out.println("\n");
		System.out.println("Odd Number: ");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2 != 0)) {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
