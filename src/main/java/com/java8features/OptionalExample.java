package com.java8features;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		String string = null;
		
		Optional<String> optional = Optional.ofNullable(string);
		
		System.out.println(optional.isPresent());
		//System.out.println(optional.get());
		
		System.out.println(optional.orElse("No Values in this Object"));

	}
}
