package com.arrays;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Integer[] intArray = new Integer[al.size()];
		al.toArray(intArray);
		
		for(int a:intArray)
			System.out.print(a+" ");
	}
}

/*
 *  Output:  10 20 30 40 
 */