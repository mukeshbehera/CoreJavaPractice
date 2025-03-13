package com.dsa;

public class BinarySearch {

    public static void main(String[] args) {

        // for binary search array should be sorted
        int[] array = {2, 4, 6, 7, 8, 10, 12, 17, 21, 31, 36};
        int target = 4;

        int index = binarySearch(array, target);
        System.out.println(index);

        //using recursion
        int recursionIndex = binarRecursionSearch(array, target, 0, array.length - 1);
        System.out.println(recursionIndex);
    }


    private static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarRecursionSearch(int[] array, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (target > array[mid]) {
                return binarRecursionSearch(array, target, mid + 1, end);
            } else if (target < array[mid]) {
                return binarRecursionSearch(array, target, start, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
