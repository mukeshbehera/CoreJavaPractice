package com.otherprograms;

import java.util.Arrays;

public class RemoveDuplicateElement1 {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,4,5,5};
		int current = a[0];
		boolean found = false;
		
		
		for(int i=0; i<a.length; i++) {
			if(current == a[i] && !found) {
				found = true;
			}
			else if (current != a[i]) {
				System.out.print(" "+current);
				current = a[i];
				found = false;
			}
		}
		System.out.print(" "+current);
	}
}
