package com.stringmanipulation;

import java.util.HashMap;
import java.util.stream.Collectors;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		
		String string = "Hello Mukesh How Are You".toLowerCase();
		string = string.replaceAll(" ", "");

		// method 1
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

		// method 2
		HashMap<Character, Integer> hashMap1 = string.chars()
													.mapToObj(c -> (char) c)
													.collect(Collectors.toMap(c -> c,
																			  c -> 1,
																			  Integer::sum,
																			  HashMap::new));
		System.out.println(hashMap1);


		// method 3
		HashMap<Character, Long> hashMap2 = string.chars()
												 .mapToObj(c -> (char) c)
												 .collect(Collectors.groupingBy(c -> c,
																				HashMap::new,
																				Collectors.counting()));
		System.out.println(hashMap2);
	}
}

/*
 *  Output:  {a=1, r=1, s=1, e=3, u=2, w=1, h=3, y=1, k=1, l=2, m=1, o=3}
 */