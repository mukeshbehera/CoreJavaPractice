package com.dsa;
/*
*
Input: arr = [0,1,0]
Output: 1

Input: arr = [0,2,1,0]
Output: 1

Input: arr = [0,10,5,2]
Output: 1
*
* Rule: as this is a mountain array, the start and end value will never be the peak index.
*       and it will have a minimum of at least 3 elements.
* */
public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};

        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("peakIndex = " + peakIndex);
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // as we are calculating (mid-1) & (mid+1), and the start and end value will never be the peak index
            // so we can skip the first and last element.
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
