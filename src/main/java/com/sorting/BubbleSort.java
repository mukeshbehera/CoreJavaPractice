package com.sorting;

import java.util.Arrays;

/**
 * Implementation of Bubble Sort algorithm
 * Time Complexity: O(n²) in worst and average cases, O(n) in best case
 * Space Complexity: O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 2, 6, 3, 8, 5, 1, 9, 4, 7 };

        boolean isSwap = false;

        // Each iteration places one largest element at its correct position
        for (int i = 0; i < array.length - 1; i++) {

            // Inner loop compares adjacent elements
            // array.length-i-1 is used because:
            // 1. After each i iteration, i elements are already sorted at the end
            // 2. -1 because we compare with j+1, preventing ArrayIndexOutOfBoundsException
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent elements and swap if they are in wrong order
                if (array[j] > array[j + 1]) {
                    // Swap elements using temporary variable
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwap = true;
                }
            }

            // Optimization: If no swaps occurred in this pass,
            // array is already sorted, so we can exit early
            if (!isSwap) {
                return;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
