package com.dsa;

import java.util.Arrays;

public class ArraySegregation {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println("Before segregation: " + Arrays.toString(arr));
        segregateZerosAndOnes(arr);
        System.out.println("After segregation: " + Arrays.toString(arr));
    }

    private static void segregateZerosAndOnes(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // move start pointer until arr 0 is encountered
            while (arr[start] == 0 && start < end) {
                start++;
            }

            // move start pointer until arr 1 is encountered
            while (arr[end] == 1 && start < end) {
                end--;
            }

            // swap 0 and 1
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
