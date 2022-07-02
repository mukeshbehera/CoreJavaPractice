package com.stringmanipulation;

import java.util.HashMap;

public class VowelsCount {

	public static void main(String[] args) {

		String string = "Mukesh Kumar Behera How Are You";
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
 * 		Input:  	Mukesh Kumar Behera How Are You 
 * 		Output: 	{a=2, u=3, e=4, o=2}
 */