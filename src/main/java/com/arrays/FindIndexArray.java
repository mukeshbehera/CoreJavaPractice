package com.arrays;

public class FindIndexArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int indexOf = 5;
		int indexIz = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == indexOf) {
				indexIz = i;
				break;
			}
		}
		
		System.out.println("Index of: "+indexOf+" is: "+indexIz);
	}
}

/*
 *  Output:  Index of: 5 is: 4

 */