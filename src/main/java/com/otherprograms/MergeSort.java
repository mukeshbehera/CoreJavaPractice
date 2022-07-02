package com.otherprograms;

import java.util.Arrays;

public class MergeSort {

	static int value1[]={1,2,4,10,6,19};
	static int value2[]={16,21,28,14,20};
	
	public static void main(String[] args) {
		
		int[] merged = new int[value1.length+value2.length];
		
		int count = 0;
		for(int i=0; i<value1.length; i++) {
			merged[i] = value1[i];
			count++;
		}
		
		for(int j=0; j<value2.length; j++) {
			merged[count++] = value2[j];
		}
		
		System.out.println("Merged Value is : "+Arrays.toString(merged).replace("[", "").replace("]", ""));
	}
}

