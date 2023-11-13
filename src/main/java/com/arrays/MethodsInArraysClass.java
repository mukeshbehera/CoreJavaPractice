package com.arrays;

import java.util.Arrays;

public class MethodsInArraysClass {

    public static void main(String[] args) {

        mismatch();
        parallelSort();
        setAll();
        sort();
        fill();
        deepToString();
    }

    /*
     * This method is used to find the index at which two arrays differ. 
     * It compares the elements of two arrays and returns the index of the first differing element. 
     * If the arrays are identical, it returns -1.
     */
    private static void mismatch() {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 6, 5 };

        int index = Arrays.mismatch(arr1, arr2);
        System.out.println("Mismatch at index: " + index); // Output: Mismatch at index: 3
    }


    /*
     * This method sorts an array in parallel, which can be more efficient for large arrays.
     * It uses a parallel sorting algorithm.
     */
    private static void parallelSort() {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 5, 5, 6, 9]

    }


    /*
     * This method allows you to set the values of an array based on an index using a lambda expression or a IntUnaryOperator.
     */
    private static void setAll() {
        int[] arr = new int[5];
        Arrays.setAll(arr, index -> index * 2);
        System.out.println(Arrays.toString(arr)); // Output: [0, 2, 4, 6, 8]

    }


    /*
     * This method sorts an array in natural order using a quicksort algorithm.
     */
    private static void sort() {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 5, 5, 6, 9]

    }


    /*
     * This method sets all elements of an array to the specified value.
     */
    private static void fill() {
        int[] arr = new int[5];
        Arrays.fill(arr, 42);
        System.out.println(Arrays.toString(arr)); // Output: [42, 42, 42, 42, 42]

    }


    /*
     *  This method returns a string representation of a deep array.
     * It's useful for arrays of arrays (e.g., a 2D array) to visualize the content.
     */
    private static void deepToString() {
        int[][] matrix = { { 1, 2 }, { 3, 4 } };
        String deepArrayString = Arrays.deepToString(matrix);
        System.out.println(deepArrayString); // Output: [[1, 2], [3, 4]]

    }
}
