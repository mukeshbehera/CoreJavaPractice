package com.exception;

public class InvalidUserExceptionExample {

	public static void validate(String user) {
		if(user.toLowerCase().equals("mukesh")) {
			System.out.println("Hello "+user);
		}
		else {
			try {
				throw new InvalidUserException("Unauthorized User Found");
			} catch (InvalidUserException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		InvalidUserExceptionExample.validate("Mukesh");
	}
}
