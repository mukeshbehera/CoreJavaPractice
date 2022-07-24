package com.arrays;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9,12};
		int delete = 9;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == delete) {
				for (int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		//putting old array into new array. New array length is -1 because it has lost an element
		int[] newArr = Arrays.copyOf(arr, arr.length-1);
		System.out.println(Arrays.toString(newArr));
	}
}

/*
 *  Output:  [1, 2, 3, 4, 5, 6, 7, 12, 12]
 *  		 [1, 2, 3, 4, 5, 6, 7, 12]
 */