package com.coding;

public class FindMedian {

    public static void main(String[] args) {

        int[] arrays = {32,12,54,68,22};

        double median = getMedian(arrays);
        System.out.println(median);
    }

    private static double getMedian(int[] arrays) {
        if (arrays.length % 2 != 0) {   //Odd numbers of elements
            int i = arrays.length / 2;
            return arrays[i];
        }
        int i = arrays.length / 2;
        return (arrays[i] + arrays[i - 1]) / 2.0;
    }
}
