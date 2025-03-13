package com.dsa;

public class MinMaxInRotatedArray {
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;

        // If the array is not rotated
        if (arr[left] < arr[right]) {
            return arr[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum lies in the unsorted part
            if (arr[mid] > arr[right]) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid; // Search in the left half
            }
        }
        return arr[left]; // Minimum found
    }

    public static int findMax(int[] arr) {
        int left = 0, right = arr.length - 1;

        // If the array is not rotated
        if (arr[left] < arr[right]) {
            return arr[right];
        }

        while (left < right) {
            int mid = left + (right - left + 1) / 2;

            // Maximum lies in the unsorted part
            if (arr[mid] > arr[left]) {
                left = mid; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return arr[left]; // Maximum found
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Minimum: " + findMin(rotatedArray)); // Output: 0
        System.out.println("Maximum: " + findMax(rotatedArray)); // Output: 7
    }
}
