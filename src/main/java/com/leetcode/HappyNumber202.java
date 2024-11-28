package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
* */
public class HappyNumber202 {

    public static void main(String[] args) {
        HappyNumber202 happyNumber = new HappyNumber202();
        boolean happy = happyNumber.isHappy(19);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {
        Set<Integer> usedInteger = new HashSet<>();
        while (n != 1 && !usedInteger.contains(n)){
            usedInteger.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
