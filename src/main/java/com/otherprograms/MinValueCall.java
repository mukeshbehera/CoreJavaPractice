package com.otherprograms;

public class MinValueCall {

	static int value[] = {21,3,52,13,25,32,101};
	
	public static int MinValueFinder(int[] arr) {
		
		int[] val=arr;
		int min = val[0];
		for(int i=1; i<val.length; i++) {
			if(min > val[i]) {
				min=val[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Min Value is : "+MinValueFinder(value));
		
	}
}
