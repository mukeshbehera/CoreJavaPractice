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
		
		System.out.println("Max Value is : "+max);
	}
}
