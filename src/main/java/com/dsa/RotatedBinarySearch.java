package com.dsa;

public class RotatedBinarySearch {

    public static int modifiedBinarySearch(int[] array, int target) {
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {  // Check if the target is at mid
                return mid;
            }

            // Determine which part is sorted
            if (array[start] <= array[mid]) {  // Left part is sorted
                if (target >= array[start] && target < array[mid]) {
                    end = mid - 1;                                    // Search in the start part
                } else {
                    start = mid + 1;                                     // Search in the end part
                }
            } else {    // Right part is sorted
                if (target > array[mid] && target <= array[end]) {
                    start = mid + 1;                                     // Search in the end part
                } else {
                    end = mid - 1;                                    // Search in the start part
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        int result = modifiedBinarySearch(array, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}
