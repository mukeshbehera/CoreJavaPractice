package com.leetcode;

import java.util.Arrays;

public class BuyAndSellStocks {
    /**
     * This method calculates the maximum profit possible from a single buy and sell transaction.
     * @param prices Array of stock prices, where prices[i] is the price of the stock on the i-th day.
     * @return Maximum profit that can be achieved from a single transaction.
     */
    public int maxProfit(int[] prices) {
        // Initialize the minimum price (buy) with the first day's price
        int buy = prices[0];
        int profit = 0;
        int sellDay = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {   // Update 'buy' if we find a lower price than the current 'buy'
                buy = prices[i];
            } else if (prices[i] - buy > profit) {    // Calculate profit if we were to sell on the i-th day
                profit = prices[i] - buy;             // Update 'profit' if this profit is higher than the current 'profit'

                sellDay = i + 1;
            }
        }
        System.out.println("Buy at: " + buy);
        System.out.println("Sell Day: " + sellDay);
        // Return the maximum profit found
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStocks solution = new BuyAndSellStocks();
        
        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(prices1));
        System.out.println("Max Profit: " + solution.maxProfit(prices1)); // Expected output: 5
        System.out.println();

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(Arrays.toString(prices2));
        System.out.println("Max Profit: " + solution.maxProfit(prices2)); // Expected output: 0
        System.out.println();

        // Test case 3
        int[] prices3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prices3));
        System.out.println("Max Profit: " + solution.maxProfit(prices3)); // Expected output: 4
    }
}
