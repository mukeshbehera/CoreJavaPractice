package com.dsa;

import java.util.*;

/*
*  find pairs in an array that sum to a specific value.
* */
public class FindThePair {

    public static void main(String[] args) {
        int[] array = {2,10,5,16,7,8,15,39,};
        int target = 15;

        List<int[]> bruitForceResult = findThePairBruitForce(array, target);
        bruitForceResult.forEach(pairs -> System.out.println("pairs: " + Arrays.toString(pairs)));

        System.out.println();

        List<int[]> thePair = findThePair(array, target);
        thePair.forEach(pairs -> System.out.println("pairs: " + Arrays.toString(pairs)));
    }

    private static List<int[]> findThePair(int[] array, int target) {
        Arrays.sort(array);
        List<int[]> result = new ArrayList<>();
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int sum = array[start] + array[end];
            if (sum == target) {
                result.add(new int[]{array[start], array[end]});
                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

    private static List<int[]> findThePairBruitForce(int[] array, int target) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    list.add(new int[]{array[i], array[j]});
                }
            }
        }

        return list;
    }
}
