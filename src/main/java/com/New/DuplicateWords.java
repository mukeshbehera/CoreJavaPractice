package com.New;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";
        findDuplicateWords(input);
    }

    public static void findDuplicateWords(String input) {
        // Normalize the string: convert to lowercase and split by non-word characters.
        String[] words = input.toLowerCase().split("\\W+");

        // Use a HashMap to store word counts.
        Map<String, Integer> wordCount = new HashMap<>();

        // Count occurrences of each word.
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display words with more than one occurrence.
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
            }
        }
    }
}

