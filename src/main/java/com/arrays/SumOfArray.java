package com.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int a:arr) {
			sum = sum+a;
		}
		
		System.out.println("Sum of the elements is: "+sum);
	}
}

/*
 *  Output:  Sum of the elements is: 150
 */