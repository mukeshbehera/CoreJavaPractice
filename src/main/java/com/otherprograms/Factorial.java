package com.otherprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int input = scanner.nextInt();
		scanner.close();

		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of " + input + " is " + factorial);

	}
}

/**
 *  Output:  Enter The Number: 5
 *  		 Factorial of 5 is 120
 *
 */