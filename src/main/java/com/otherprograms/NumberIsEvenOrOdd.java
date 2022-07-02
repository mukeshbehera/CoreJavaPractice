package com.otherprograms;

import java.util.Scanner;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a valid Integer: ");
		int input = scanner.nextInt();
		scanner.close();
		
		if(input%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
	}
}
