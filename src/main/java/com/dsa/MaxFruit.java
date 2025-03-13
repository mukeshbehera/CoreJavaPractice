package com.dsa;

import java.util.HashMap;


/*
*
Given the integer array fruits, and you have only two buckets
  return the maximum number of fruits you can pick.
fruits = [1,2,1] output = 3
fruits[i] = [1,2,3,2,2,1] output =4
fruits[i] = [0,1,2,2] output=3
* */

public class MaxFruit {


    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2, 1};

        int max = getMaximumFruit(fruits);
        System.out.println("Maximum number of fruits: " + max);

        int max1 = getMaximumFruitSlidingWindow(fruits);
        System.out.println("max1 = " + max1);
    }

    private static int getMaximumFruit(int[] fruits) {
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {
            HashMap<Integer, Integer> fruitCount = new HashMap<>();

            for (int j = i; j < fruits.length; j++) {
                fruitCount.put(fruits[j], fruitCount.getOrDefault(fruits[j], 0) + 1);

                if (fruitCount.size() > 2) {
                    break;
                }

                max = Math.max(max, j - i + 1);
            }

        }
        return max;
    }

    private static int getMaximumFruitSlidingWindow(int[] fruits) {
        int max = 0;
        int i = 0; // Start of the window
        HashMap<Integer, Integer> fruitCount = new HashMap<>();

        for (int j = 0; j < fruits.length; j++) {
            fruitCount.put(fruits[j], fruitCount.getOrDefault(fruits[j], 0) + 1);

            // If the window has more than 2 distinct fruits, move the left pointer 'i' to reduce it
            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[i], fruitCount.get(fruits[i]) - 1);
                if (fruitCount.get(fruits[i]) == 0) {
                    fruitCount.remove(fruits[i]);
                }
                i++;
            }

            // Calculate the maximum length of the window
            max = Math.max(max, j - i + 1);
        }

        return max;
    }

}
