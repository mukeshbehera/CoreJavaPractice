package com.stringmanipulation;

import java.util.HashMap;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		
		String string = "Hello Mukesh How Are You".toLowerCase();
		string = string.replaceAll(" ", "");
		
		char[] charArr = string.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for (char c : charArr) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}
			else {
				hashMap.put(c, 1);
			}
		}
		
		System.out.println(hashMap);
	}
}
