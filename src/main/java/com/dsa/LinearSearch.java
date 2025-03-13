package com.dsa;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {3,8,5,9,10,2};
        int target = 5;

        // time complexity O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println(target + " at index: " + i);
            }
        }
    }
}
