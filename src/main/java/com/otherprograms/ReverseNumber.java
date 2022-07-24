package com.otherprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 123456789;
		int revNum = 0;
		
		while(number != 0) {
			revNum = revNum*10;
			revNum = revNum + number%10;
			number = number/10;
		}
		
		
		System.out.println(revNum);
	}
}

/*
 *   Output:	987654321
 */