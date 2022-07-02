package com.other;

import java.util.Arrays;
import java.util.List;

public class ForEachWithLambdaAndMethodReference {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Mukesh","Satyam","Shivam","Sundaram");
		
		//using Lambda
		list.forEach(s -> System.out.println(s));
		
		
		//using Method Reference
		list.forEach(System.out::println);
	}
}
