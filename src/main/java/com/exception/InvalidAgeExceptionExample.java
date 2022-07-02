package com.exception;

public class InvalidAgeExceptionExample {

	public static void validator(int age) {
		if(age < 18)
			try {
				throw new InvalidAgeException("You are not eligible for voting");
			} catch (InvalidAgeException e) {
				e.printStackTrace();
			}
		else {
			System.out.println("Welcome to our voting system");
		}
	}
	
	
	public static void main(String[] args) {
		InvalidAgeExceptionExample.validator(17);
	}
}
