package com.New;

import java.util.HashMap;

public class LongestSubstringExample {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }


    /*
     * without HashMap (faster)
     * */
    private static String findLongestSubstring(String input) {
        int maxLength = 0;
        int longestStart = 0;

        for (int right=0, left=0; right<input.length(); right++){
            int locationOfFirstAppearanceInSubstring = input.indexOf(input.charAt(right), left);
            if (locationOfFirstAppearanceInSubstring != right){
                left = locationOfFirstAppearanceInSubstring + 1;
            }

            int currentLength = right - left + 1;
            if (currentLength > maxLength){
                maxLength = currentLength;
                longestStart = left;
            }

        }

        return input.substring(longestStart, longestStart + maxLength);
    }

    /*private static String findLongestSubstring(String input) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0; // Starting index of the current substring
        int maxLength = 0; // Length of the longest substring found
        int longestStart = 0; // Start index of the longest substring

        for (int right = 0; right < input.length(); right++) {
            char currentChar = input.charAt(right);

            // If the character is already in the map, move the left to the right of the last occurrence
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }

            // Update the character's index in the map
            charIndexMap.put(currentChar, right);

            // Update the longest substring if needed
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestStart = left;
            }
        }

        // Return the longest substring
        return input.substring(longestStart, longestStart + maxLength);
    }*/
}
