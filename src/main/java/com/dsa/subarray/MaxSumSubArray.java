package com.dsa.subarray;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] array = {3, -4, 5, 4, -1, 7, -8};
//        int[] array = {-2,-4};

//        printAllSubArrays(array);

        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < array.length; start++) {
            int currentSum = 0;
            for (int end = start; end < array.length; end++) {
                currentSum += array[end];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("maxSum = " + maxSum);
    }

    private static void printAllSubArrays(int[] array) {
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(array[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
