package com.otherprograms;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		
		int value[] = {21,3,52,13,25,32,101};
		
		System.out.println("The given value is : "+Arrays.toString(value).replace("[", "").replace("]", ""));
		
		int max = value[0];
		for(int i=1; i<value.length;i++) {
			if(max < value[i]) {
				max = value[i];
			}
		}


		//using linear time complexity
		int max1 = 0;

		for (int num : value) {
			if (num > max1) {
				max1 = num;  // Update max1 to the current element
			}
		}
		
		System.out.println("Max Value is : "+max);
	}
}
