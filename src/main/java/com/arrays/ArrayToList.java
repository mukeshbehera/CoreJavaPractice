package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		String[] arr = {"red", "green", "blue"};
		
		//method 1
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		
		//method 2
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al, arr);
		System.out.println(al);
		
		
		//method 3
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String st:arr) {
			arrayList.add(st);
		}
		System.out.println(arrayList);
	}
}

/*
 *  Output:  [red, green, blue]
 *  		 [red, green, blue]
 *  		 [red, green, blue]
 */