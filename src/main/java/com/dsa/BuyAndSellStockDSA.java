package com.dsa;

import java.util.Arrays;

public class BuyAndSellStockDSA {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }

            bestBuy = Math.min(bestBuy, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(prices1));
        System.out.println("Max Profit: " + maxProfit(prices1)); // Expected output: 5
        System.out.println();

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(Arrays.toString(prices2));
        System.out.println("Max Profit: " + maxProfit(prices2)); // Expected output: 0
        System.out.println();

        // Test case 3
        int[] prices3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prices3));
        System.out.println("Max Profit: " + maxProfit(prices3)); // Expected output: 4
    }
}
