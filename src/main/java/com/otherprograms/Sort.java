package com.otherprograms;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		int[] value = {34,56,8,24,69,19,2,5,12,65};
		
		System.out.println("Given Value is : "+Arrays.toString(value).replace("[", "").replace("]", ""));
		
		int temp=0;
		for(int i=0; i<value.length; i++) {
			for(int j=i+1; j<value.length; j++) {
				if(value[i] > value[j]) {
					temp = value[i];
					value[i] = value[j];
					value[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Value is : "+Arrays.toString(value).replace("[", "").replace("]", ""));
	}
}
