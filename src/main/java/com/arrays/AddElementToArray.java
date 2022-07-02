package com.arrays;

import java.util.Arrays;

public class AddElementToArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int numToBeAdded = 9;
		
		//creating new array+1 to store the new value
		int[] newArray = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			newArray[i] = arr[i];
		}
		newArray[arr.length] = numToBeAdded;
		
		
		//printing using for advance loop
		System.out.println(Arrays.toString(newArray));
	}
}
