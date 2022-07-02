package com.otherprograms;

import java.util.Arrays;

public class MinValue {

	public static void main(String[] args) {
		
		int value[] = {21,3,52,13,25,32,101};
		
		System.out.println("The given value is : "+Arrays.toString(value).replace("[", "").replace("]", ""));
		
		int min = value[0];
		for(int i=1; i<value.length; i++) {
			if(min > value[i]) {
				min = value[i];
			}
		}
		
		System.out.println("Min Value is : "+min);
	}
}
