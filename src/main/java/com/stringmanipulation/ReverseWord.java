package com.stringmanipulation;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "Mukesh Kumar Behera";
		String[] strArr = input.split(" ");
		String reverString = "";
		
		
		for(int i=strArr.length-1; i>=0; i--) {
			reverString = reverString + strArr[i] + " ";
		}
		System.out.println(reverString);
	}
}
