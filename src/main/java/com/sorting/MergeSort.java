package com.sorting;

public class MergeSort {
    // Merge sort function
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merge function to combine two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        // Sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        // Merge the temporary arrays
        int i = 0, j = 0; // Initial indices of subarrays
        int k = left; // Initial index of the merged subarray

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
