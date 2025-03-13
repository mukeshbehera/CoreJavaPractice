package com.otherprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String string = "java spring boot";

        Character result = approach1(string);
        System.out.println("result = " + result);

        Character result1 = approach2(string);
        System.out.println("result1 = " + result1);
    }

    private static Character approach2(String string) {
        Character result = string.chars()
                                 .mapToObj(s -> Character.toLowerCase((char) s))
                                 .collect(Collectors.groupingBy(Function.identity(),
                                                                LinkedHashMap::new,
                                                                Collectors.counting()))
                                 .entrySet()
                                 .stream()
                                 .filter(entry -> entry.getValue() == 1L)
                                 .map(Map.Entry::getKey)
                                 .findFirst()
                                 .orElseThrow(() -> new RuntimeException("No result found"));
        return result;
    }

    private static Character approach1(String string) {
        char[] charArray = string.toCharArray();

        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        for (char c : charArray) {
            if (c != ' ') {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
