package com.arrays;

public class TestArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int num = 9;
		
		int[] newAr = new int[arr.length+1];
		
		
		for(int i=0; i<arr.length; i++) {
			newAr[i] = arr[i];
		}
		newAr[arr.length] = 9;
		
		
		for(int a:newAr)
			System.out.print(a+" ");
	}
}
