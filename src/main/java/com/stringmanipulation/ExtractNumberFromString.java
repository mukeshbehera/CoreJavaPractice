package com.stringmanipulation;

import java.util.Scanner;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String that contains Numbers: ");
		String input = scanner.nextLine();
		
		//Extracting Numbers
		int number = Integer.parseInt(input.replaceAll("[^0-9]", ""));
		System.out.println("Number is: "+number);
		scanner.close();
		
	}
}

/*
 *  Output:  Enter String that contains Numbers: Hello@1234
 *  		 Number is: 1234
 */