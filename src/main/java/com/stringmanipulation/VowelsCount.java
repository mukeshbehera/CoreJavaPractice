package com.stringmanipulation;

import java.util.HashMap;

public class VowelsCount {

	public static void main(String[] args) {

		String string = "Hello Mukesh How Are You Doing";
		int count = 0;

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.toLowerCase().charAt(i);
			
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				count = count+1;
				
				if (hashMap.containsKey(ch)) {
					hashMap.put(ch, hashMap.get(ch) + 1);
				} else {
					hashMap.put(ch, 1);
				}
			}
		}

		System.out.println("Number Of Vowels: "+count);
		System.out.println(hashMap);
	}
}

/*
 * 		Input:  	Hello Mukesh How Are You Doing 
 * 		Output: 	Number Of Vowels: 11
 * 					{a=1, e=3, u=2, i=1, o=4}
 */