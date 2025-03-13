package com.dsa;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int bruitForceApproach = findMaxWaterBruitForceApproach(heights);
        System.out.println("maxWater = " + bruitForceApproach);

        int twoPointerApproach = findMaxWaterTwoPointerApproach(heights);
        System.out.println("twoPointerApproach = " + twoPointerApproach);
    }

    private static int findMaxWaterTwoPointerApproach(int[] heights) {
        int maxWater = 0;
        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            int width = end - start;
            int height = Math.min(heights[start], heights[end]);
            int currentMaxWater = height * width;

            maxWater = Math.max(maxWater, currentMaxWater);

            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }

    private static int findMaxWaterBruitForceApproach(int[] heights) {
        int maxWater = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int width = j - i;
                int height = Math.min(heights[i], heights[j]);
                int currentWater = height * width;

                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
}
