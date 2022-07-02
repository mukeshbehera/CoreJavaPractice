package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ShortingMapUsingStream {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(111, "Lisa");
		hashMap.put(222, "Narayan");
		hashMap.put(333, "Mayank");
		hashMap.put(444, "Arunkumar");
		hashMap.put(555, "Jyous");
		hashMap.put(666, "Klusener");
		
		System.out.println(hashMap);
		
		Map<Integer, String> sortedMap = 
				hashMap.entrySet().stream().sorted(Entry.comparingByKey())
								.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedMap);
	}
}
