package com.dsa;

import java.util.Arrays;
import java.util.Comparator;

public class MaxSumOfTwo {
    public static void main(String[] args) {
//        int[] array = {-2, -4};  //output:- -6
        int[] array = {2, 9, 10, 5};

        approach1(array);
        System.out.println();

        approach2(array);
    }

    private static void approach2(int[] array) {
        Integer i = Arrays.stream(array)
                          .boxed()
                          .sorted(Comparator.reverseOrder())
                          .limit(2)
                          .reduce(Integer::sum)
                          .get();
        System.out.println("max = " + i);
    }

    private static void approach1(int[] array) {
        // Initialize variables to hold the two largest numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Find the two largest numbers in the array
        for (int num : array) {
            if (num > max1) {
                max2 = max1; // Update the second largest
                max1 = num;  // Update the largest
            } else if (num > max2) {
                max2 = num;  // Update the second largest
            }
        }

        // The maximum sum is the sum of the two largest numbers
        int max = max1 + max2;
        System.out.println("max = " + max); // Output: max = 19
    }
}
