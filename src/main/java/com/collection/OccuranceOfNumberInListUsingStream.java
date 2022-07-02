package com.collection;

import java.util.Arrays;
import java.util.List;

public class OccuranceOfNumberInListUsingStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,5,8,8,9,2,2,2);
		
		long count = list.stream().filter(ls -> ls.equals(2)).count();
		System.out.println(count);
		
	}
}
