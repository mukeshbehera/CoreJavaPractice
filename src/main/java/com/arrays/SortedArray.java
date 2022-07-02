package com.arrays;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		
		int[] numArr = {34,56,8,24,69,19,2,5,12,65};
		
		int temp = 0;
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=i+1; j<numArr.length; j++) {
				if(numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
					
//					numArr[i] = numArr[i] + numArr[j];  // x = x + y   	without using 3d variable
//					numArr[j] = numArr[i] - numArr[j];  // y = x - y
//					numArr[i] = numArr[i] - numArr[j];	// x = x - y;
				}
			}
		}
		
		System.out.println(Arrays.toString(numArr));
	}
}
