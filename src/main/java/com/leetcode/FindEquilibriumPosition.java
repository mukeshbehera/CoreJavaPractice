package com.leetcode;

import java.util.Arrays;

public class FindEquilibriumPosition {

    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }
//        totalSum = Arrays.stream(arr).sum();

        // Traverse the array and check for equilibrium position
        for (int i = 0; i < arr.length; i++) {
            // Right sum is calculated as totalSum - leftSum - arr[i]
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;  // Equilibrium index found
            }
            // Update leftSum for the next element
            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibriumIndex = findEquilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println(Arrays.toString(arr).replace("[","").replace("]",""));
            System.out.println("Equilibrium position is at index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium position found.");
        }
    }
}
