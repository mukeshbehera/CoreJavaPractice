package com.arrays;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int numberToDelete = 4;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == numberToDelete) {
				arr[i] = arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//putting old array into new array. New array length is -1 because it has lost an element
		int[] newArr = new int[arr.length-1];
		
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
