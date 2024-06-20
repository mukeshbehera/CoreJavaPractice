package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

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


		// Using Stream
		// (IntStream.range(0, arr.length)) represents the indices of the array {0, 1, 2, 3, 4}
		// (Arrays.stream(arr)) not applicable here because it returns the elements of the array.
		IntStream.range(0, arr.length)
				 .filter(i -> arr[i] == indexOf)
				 .findFirst()
//				.getAsInt()
				 .ifPresentOrElse(i -> System.out.println("Index of: "+indexOf+" is: "+i), () -> System.out.println("Index not found"));


		// Using binary search
		int index = Arrays.binarySearch(arr, indexOf);
		System.out.println("Index of: "+indexOf+" is: "+index);
		// Returns index of the element if found, else returns (-(insertion point) - 1)
	}
}

/*
 *  Output:  Index of: 5 is: 4

 */