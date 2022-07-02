package com.collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(2, "Two");
		hashMap.put(1,"One");
		hashMap.put(3, "Three");
		
		hashMap.forEach((k, v) -> System.out.println("Key: "+k+" and Value: "+v));
		
	}
}
