package com.stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringUsingLoop {

	public static void main(String[] args) throws IOException{
		//using InputStreamReader and BufferedReader to get input
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		//taking input and printing
		System.out.print("Enter the String: ");
		String str = bufferedReader.readLine();
		System.out.println(str);
		
		
		
		//reverse string logic
		String reverseString = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseString = reverseString+str.charAt(i);
		}
		System.out.println(reverseString);
	}
}
