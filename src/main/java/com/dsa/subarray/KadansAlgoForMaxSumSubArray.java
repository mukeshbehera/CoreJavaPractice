package com.dsa.subarray;
/*
* The algorithm maintains a running sum (called currentSum)
* while traversing the array and keeps track of the maximum sum encountered so far (called maxSum).
* It resets currentSum to 0 whenever the sum goes negative
* because a negative sum will decrease the total sum of any future subarray.
* */
public class KadansAlgoForMaxSumSubArray {

    public static void main(String[] args) {
        int[] array = {3, -4, 5, 4, -1, 7, -8};

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : array) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("maxSum = " + maxSum);
    }
}
