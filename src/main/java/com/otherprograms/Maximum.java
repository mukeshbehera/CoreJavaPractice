package com.otherprograms;

public class Maximum {

	public static void main(String args[]) {
		int[] a = {10,20,30,40};
		for(int a1:a) {
			System.out.println(a1);
		}
		
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		
		System.out.println("Maximum Value is: "+max);
	}
}
