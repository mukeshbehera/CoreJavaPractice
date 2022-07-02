package com.otherprograms;

import java.util.Scanner;

//a number that can be divided exactly only by itself and 1, for example 7, 17 and 41
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int end = scanner.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}



	public static boolean isPrime(int number) {
		if (number < 1) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number%i == 0) {
				return false;
			}
		}
		return true;
	}
}
