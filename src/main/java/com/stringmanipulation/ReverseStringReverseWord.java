package com.stringmanipulation;

public class ReverseStringReverseWord {

	public static void main(String[] args) {

		String str = "My Name is Khan And I am Not a Terrorist";

		
		//reverse string
		String[] reverseString = str.split("");
		for (int i = reverseString.length - 1; i >= 0; i--) {
			System.out.print(reverseString[i]);
		}
		
		System.out.println("");
		
		
		//reverse word
		String[] reverseWord = str.split(" ");
		for (int i = reverseWord.length - 1; i >= 0; i--) {
			System.out.print(reverseWord[i]+" ");
		}
	}
}
