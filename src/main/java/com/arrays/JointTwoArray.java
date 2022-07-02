package com.arrays;

public class JointTwoArray {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8,9};
		
		//creating new array of length arr1+arr2
		int[] newArr = new int[arr1.length + arr2.length];
		
		
		//for adding 1st array
		for(int i=0; i<arr1.length; i++)
			newArr[i] = arr1[i];

		
		//for adding 2nd array
		for(int i=0; i<arr2.length; i++)
			newArr[arr1.length+i] = arr2[i];
		
		
		//printing using advance for loop
		for(int a:newArr)
			System.out.print(a+" ");
	}

}
