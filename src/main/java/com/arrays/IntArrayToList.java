package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToList {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);

		ArrayList<Integer> arrayList = Arrays.stream(arr)
										   .boxed()
										   .collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arrayList);
	}
}
