package com.arrays;

import java.util.Arrays;

public class JointTwoArray {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8,9};
		
		/*
		 * METHOD 1
		 */		
		//creating new array of length arr1+arr2
		int[] newArr = new int[arr1.length + arr2.length];
		//for adding 1st array
		for(int i=0; i<arr1.length; i++)
			newArr[i] = arr1[i];
		//for adding 2nd array
		for(int i=0; i<arr2.length; i++)
			newArr[arr1.length+i] = arr2[i];
		//printing
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		/*
		 * METHOD 2
		 */		
		int[] method2Arr = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, method2Arr, 0, arr1.length);
		System.arraycopy(arr2, 0, method2Arr, arr1.length, arr2.length);
		//Printing
		System.out.println(Arrays.toString(method2Arr));
	}

}

/*
 *  Output:  [1, 2, 3, 4, 5, 6, 7, 8, 9]
 *  		 [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */