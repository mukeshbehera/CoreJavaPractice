package com.sorting;

import java.util.Arrays;

/**
 * Implementation of Selection Sort algorithm.
 * Time Complexity: O(n²) for all cases
 * Space Complexity: O(1)
 * Stable: No
 * In-place: Yes
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = { 2, 6, 3, 8, 5, 1, 9, 4, 7 };

        // Iterate through the array from start to second-to-last element
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the current position holds the smallest element
            int smallestIndex = i;

            // Search for a smaller element in the rest of the array
            for (int j = i + 1; j < array.length; j++) {
                // If we find a smaller element, update smallestIndex
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap the found smallest element with the first element of unsorted part
            // (only if we found a smaller element)
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
