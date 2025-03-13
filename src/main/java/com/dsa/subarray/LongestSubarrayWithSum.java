package com.dsa.subarray;
/*
You are given an array of integers nums and an integer K.
Find the length of the longest subarray whose sum is less than or equal to K.
*/
public class LongestSubarrayWithSum {

    public static int longestSubarrayWithSum(int[] nums, int k) {
        int left = 0, sum = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add the current element to the sum
            sum += nums[right];

            // Shrink the window until the sum is less than or equal to K
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 9;
        System.out.println("Longest Subarray Length: " + longestSubarrayWithSum(nums, k));
    }
}
