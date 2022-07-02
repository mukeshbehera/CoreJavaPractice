package com.arrays;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		
		int[] numArr = {34,56,8,24,69,19,2,5,12,65};
		System.out.println(Arrays.toString(numArr));
		
		
		int max = numArr[0];
		for(int i=0; i<numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		
		System.out.println("Max Value is: "+max);
	}
}
