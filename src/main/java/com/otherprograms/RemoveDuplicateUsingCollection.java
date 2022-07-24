package com.otherprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateUsingCollection {

	public static void main(String[] args) {
		
		int[] a = {1,2,2,3,4,5,5,5,6,7,8,8,9,9};
		
		
		//LinkedHashSet maintain order and dosen't allow duplicate
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (Integer integer : a) {
			linkedHashSet.add(integer);
		}
		
		
		//printing the LinkedHashSet
		System.out.println(linkedHashSet);
	}
}
/* 
 *    Output:	[1, 2, 3, 4, 5, 6, 7, 8, 9]
 */