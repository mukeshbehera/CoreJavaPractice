package com.arrays;

import java.util.Arrays;

public class SecondHighestNumberArray {

	public static void main(String[] args) {
		
		int[] numArr = {34,56,8,24,69,19,2,5,12,65};
		
		int temp = 0;
		for(int i=0; i<numArr.length; i++) {
			for(int j=i+1; j<numArr.length; j++) {
				if(numArr[i] < numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("Second Highest Value: "+numArr[1]);
	}
}

/*
 *  Output:  [69, 65, 56, 34, 24, 19, 12, 8, 5, 2]
 *  		 Second Highest Value: 65
 */