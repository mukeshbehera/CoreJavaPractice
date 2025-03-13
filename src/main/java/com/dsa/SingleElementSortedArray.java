package com.dsa;

import java.util.HashSet;

public class SingleElementSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 10};

        // time complexity is O(n) and space complexity is O(n)
        int element = findElement(array);
        System.out.println("index = " + element);

        //time complexity is O(log n) and space complexity is O(1)
        int element1 = findElementUsingBinarySearch(array);
        System.out.println("index = " + element1);
    }

    private static int findElementUsingBinarySearch(int[] array) {
        int n = array.length;

        if (n == 1) return array[0];

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0 && array[0] != array[1]) return array[mid];
            if (mid == n-1 && array[n-1] != array[n-2]) return  array[mid];

            if (array[mid-1] != array[mid] && array[mid] != array[mid+1]) return array[mid];

            if (mid % 2 == 0) {
                if (array[mid - 1] == array[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (array[mid - 1] == array[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    // this method returns the index of the array, not the element itself
    private static int findElement(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (hashSet.contains(array[i])) {
                hashSet.remove(array[i]);
            } else {
                hashSet.add(array[i]);
            }
        }
        return hashSet.iterator().next();
    }
}
