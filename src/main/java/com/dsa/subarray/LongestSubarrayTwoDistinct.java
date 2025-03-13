package com.dsa.subarray;

import java.util.HashMap;
/*
You are given an array of integers (or characters),
and you need to find the length of the longest subarray
that contains at most two distinct integers (or characters).
*/
public class LongestSubarrayTwoDistinct {

    public static int longestSubarrayWithTwoDistinct(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>(); // To store frequency of elements
        int left = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            // Shrink the window if it contains more than 2 distinct elements
            while (freqMap.size() > 2) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]); // Remove element with zero frequency
                }
                left++; // Move the left pointer
            }

            // Calculate the current window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        System.out.println("Longest Subarray Length: " + longestSubarrayWithTwoDistinct(nums));
    }
}
