package com.arrays;

import java.util.Arrays;

public class FindMaxMinArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 5, 70, 4 };
		System.out.println(Arrays.toString(arr));
		
		
		// maximum & minimum element of the Array
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("minimum value is =" + min);
		System.out.println("maximum value is =" + max);
	}
}

/*
 *  Output:  [10, 20, 5, 70, 4]
 *  		 minimum value is =4
 *  		 maximum value is =70
 */