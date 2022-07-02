package com.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(14, 1254, 324, 4351, 112);
		
		System.out.println(integers);
		
		integers.stream().forEach(e -> {
				System.out.println(e);
			});
		
		System.out.println("");
		
		integers.stream().forEach(System.out::println);
	}
}
