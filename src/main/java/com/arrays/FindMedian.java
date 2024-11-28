package com.arrays;

import java.util.Arrays;

public class FindMedian {
    
    public static void main(String[] args) {
        
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5,7};

        int[] arr3 = new int[arr1.length+arr2.length];
        
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        /*int i=0,j=0,k = 0;
         Arrays.sort(arr3);
         while (i < arr1.length && j < arr2.length) {
             if(arr1[i] < arr2[j]){
                 arr3[k] = arr1[i];
                 ++k;
                 ++i;
             } else {
                 arr3[k] = arr2[j];
                 ++k;
                 ++j;
             }
         }

        for (int k2 = 0; k2 < arr3.length; k2++) {
            for (int l = i+1; l < arr3.length; l++) {
                if (arr3[i] < arr3[j]) {
                    arr3[i] = arr3[i] + arr3[j];
                    arr3[j] = arr3[i] - arr3[j];
                    arr3[i] = arr3[i] - arr3[j];
                }
            }
        }*/

       // System.out.println(arr3);

        int findMedianFor = findMedianFor(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        System.out.println("MEDIAN: " + findMedianFor);
    }

    private static int findMedianFor(int[] arr3) {
        int median = 0;
        if(arr3.length%2 == 0){
            int temp = arr3.length/2;
            median = (arr3[temp-1] + arr3[temp])/2;
        } else{
            int temp = (arr3.length-1)/2;
            median = arr3[temp];
        }
        return median;
    }
}
