package com.otherprograms;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swaping: a = "+ a +", b = "+b);
		
		//swapping logic
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swaping: a = "+ a +", b = "+b);
	}
}
