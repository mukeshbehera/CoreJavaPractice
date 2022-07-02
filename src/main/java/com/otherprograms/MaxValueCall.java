package com.otherprograms;

public class MaxValueCall {

	static int value[] = {21,3,52,13,25,32,101};
	
	public static int MaxVAlueFinder(int[] arr) {
		int[] val=arr;
		int max = val[0];
		for(int i=1; i<val.length;i++) {
			if(max<val[i]) {
				max=val[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
	
		System.out.println("Max Value is : "+MaxVAlueFinder(value));
	}
}
