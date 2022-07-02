package com.otherprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int factorial = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number: ");
		int input = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of " + input + " is " + factorial);

	}
}
