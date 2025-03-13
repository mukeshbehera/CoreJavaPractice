package com.dsa;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));

        int[] mergedUsingStream = mergeUsingStream(array1, array2);
        System.out.println(Arrays.toString(mergedUsingStream));
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n = array1.length;
        int m = array2.length;

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (array1[i] < array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }

        if (i < n) {
            merged[k++] = array1[i++];
        }

        if (j < m) {
            merged[k++] = array2[j++];
        }

        return merged;
    }

    private static int[] mergeUsingStream(int[] array1, int[] array2) {
        int[] mergedArray = Stream.concat(Arrays.stream(array1).boxed(),
                                          Arrays.stream(array2).boxed())
                                  .sorted()
                                  .mapToInt(Integer::intValue)
                                  .toArray();
        return mergedArray;
    }
}
