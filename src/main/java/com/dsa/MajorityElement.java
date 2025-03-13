package com.dsa;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 2};

        int result = bruitForceApproach(array);
        System.out.println("Bruit Force: " + result);

        int result1 = optimizedApproach(array);
        System.out.println("Optimized: " + result1);

        int result2 = mooreApproach(array);
        System.out.println("Moore: " + result2);
    }

    private static int mooreApproach(int[] array) {
        int frequency = 0;
        int ans = 0;

        for (int i = 0; i < array.length; i++) {
            if (frequency == 0) {
                ans = array[i];
            }

            if (ans == array[i]) {
                frequency++;
            } else {
                frequency--;
            }
        }


        /*int count = 0;
        for (int num : array) {
            if (num == ans) {
                count++;
            }

            if (count > array.length / 2) {
                return ans;
            } else {
                return -1;
            }
        }*/


        return ans;
    }

    private static int optimizedApproach(int[] array) {
        Arrays.sort(array);
        int frequency = 0;
        int ans = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                frequency++;
            } else {
                frequency = 1;
                ans = array[i];
            }

            if (frequency > array.length / 2) {
                return ans;
            }
        }
        return -1;
    }

    private static int bruitForceApproach(int[] array) {

        for (int num : array) {
            int frequency = 0;

            for (int el : array) {
                if (num == el) {
                    frequency++;
                }
            }

            if (frequency > array.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
