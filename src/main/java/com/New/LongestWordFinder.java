package com.New;

import java.util.HashMap;

public class LongestWordFinder {
    public static String longestWord(String letters, String[] dictionary) {
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (char c : letters.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        String longest = "";

        for (String word : dictionary) {
            HashMap<Character, Integer> wordCounts = new HashMap<>();
            boolean isConstructible = true;

            for (char c : word.toCharArray()) {
                wordCounts.put(c, wordCounts.getOrDefault(c, 0) + 1);

                if (!letterCounts.containsKey(c) || wordCounts.get(c) > letterCounts.get(c)) {
                    isConstructible = false;
                    break;
                }
            }

            if (isConstructible && word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String letters = "tac";
        String[] dictionary = { "bat", "cat", "rat", "bar", "car" };

        String longest = longestWord(letters, dictionary);
        System.out.println("Longest word: " + longest);
    }
}

