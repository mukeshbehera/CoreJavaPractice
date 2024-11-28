package com.coding;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String word1 = "Listen";
        String word2 = "Silent";

        String string = anagramCheck(word1, word2) ? "anagram" : "not anagram";
        System.out.println("Words are " + string);
    }

    private static Boolean anagramCheck(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }
        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
