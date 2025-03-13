package com.arrays;

import java.util.Arrays;

public class FindMedian {
    
    public static void main(String[] args) {
        
        int[] array1 = {2,4,6,8};
        int[] array2 = {1,3,5,7};

        int[] array3 = new int[array1.length+array2.length];
        
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        /*int i=0,j=0,k = 0;
         Arrays.sort(array3);
         while (i < array1.length && j < array2.length) {
             if(array1[i] < array2[j]){
                 array3[k] = array1[i];
                 ++k;
                 ++i;
             } else {
                 array3[k] = array2[j];
                 ++k;
                 ++j;
             }
         }

        for (int k2 = 0; k2 < array3.length; k2++) {
            for (int l = i+1; l < array3.length; l++) {
                if (array3[i] < array3[j]) {
                    array3[i] = array3[i] + array3[j];
                    array3[j] = array3[i] - array3[j];
                    array3[i] = array3[i] - array3[j];
                }
            }
        }*/

       // System.out.println(array3);

        double findMedianFor = findMedianFor(array3);
        System.out.println(Arrays.toString(array3));
        System.out.println(array3.length);

        System.out.println("MEDIAN: " + findMedianFor);
    }

    private static double findMedianFor(int[] array3) {
        double median = 0;

        if (array3.length % 2 == 0) {
            int i = array3.length / 2;
            median = (array3[i] + array3[i - 1]) / 2.0;
        } else {
            int i = array3.length/2;
            median = array3[i];
        }
        return median;
    }
}
