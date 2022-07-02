package com.stringmanipulation;

import java.util.Scanner;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string that contsins special character: ");
		String input = scanner.nextLine();
		
		/*
		 * a-z(all small characters),	A-Z(all capital characters),	0-9(all number from 0 to 9)
		 *  "[^a-zA-Z0-9]"  :  Mukesh1234(Output),    (Mukesh@1234-Input)
		 *  "[a-zA-Z0-9]"  :  @(Output),    (Mukesh@1234-Input)
		*/
		String characters = input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(characters);
	}
}
