package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

	public static void main(String[] args) {

		String[] arr = {"red", "green", "blue"};
		int[] arr1 = {10,20,30,40,50};

		//method 1
		List<String> list = Arrays.asList(arr);
		System.out.println(list);


		//method 2
//		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al, arr);
		System.out.println(al);


		//method 3
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String st:arr) {
			arrayList.add(st);
		}
		System.out.println(arrayList);

		//Using Stream
		ArrayList<String> arrayList2 = Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arrayList2);
		ArrayList<Integer> arrayList3 = Arrays.stream(arr1)
											  .boxed()
											  .collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arrayList3);
	}
}

/*
 *  Output:  [red, green, blue]
 *  		 [red, green, blue]
 *  		 [red, green, blue]
 */