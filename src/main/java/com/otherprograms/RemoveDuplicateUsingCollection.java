package com.otherprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateUsingCollection {

	public static void main(String[] args) {
		
		int[] a = {10,3,8,5,4,2,5,22,3,8,7};
		
		
		
		//LinkedHashSet maintain order and dosen't allow duplicate
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
		}
		
		
		//printing the LinkedHashSet
		for(int no:hs) {
			System.out.print(no+", ");
		}
	}
}
