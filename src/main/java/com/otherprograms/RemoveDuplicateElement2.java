package com.otherprograms;

public class RemoveDuplicateElement2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,4,5,5};
		
		int temp = 0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] != a[i+1]) {
				a[temp] = a[i];
				temp++;
			}
		}
		
		
		
		//printing array using nested for loop
		for(int ar:a) {
			System.out.print(ar+", ");
		}
	}
}
