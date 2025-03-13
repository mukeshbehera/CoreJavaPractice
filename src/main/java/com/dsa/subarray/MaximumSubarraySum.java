package com.dsa.subarray;
/*
 Find the contiguous subarray (containing at least one number)
 within an array that has the largest sum.
 This is a classic problem where Kadane's Algorithm is applied.
*/
public class MaximumSubarraySum {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Extend the current subarray or start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum encountered so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
