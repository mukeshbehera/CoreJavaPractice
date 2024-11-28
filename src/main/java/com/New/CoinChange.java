package com.New;

/*
 * You are given an integer array coins representing coins of different denominations and
 * an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money can not be made up by any combination of coins, return -1.
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {
    public static void main(String[] args) {
        
        int[] coins =  {4,6,10,15};
        int requiredAmount = 158;


        StringBuffer sb = coinCalculate(coins, requiredAmount);;
        System.out.println(sb);
    }

    private static StringBuffer coinCalculate(int[] coins, int requiredAmount) {
        StringBuffer sb = new StringBuffer();

        for(int i=coins.length-1; i>=0; i--){
            if (requiredAmount >= coins[i]) {
                int numCoins = requiredAmount / coins[i];

                sb.append(coins[i])
                  .append(":")
                  .append(numCoins)
                  .append(", ");

                //updating the requiredAmount
                requiredAmount = requiredAmount - (coins[i] * numCoins);
            }
        }
        if (requiredAmount != 0) {
//            sb = sb.delete(0, sb.length());
//            return sb.append("-1");
            sb.append("remainder : ")
              .append(requiredAmount);
        }
        return sb;
    }
}
