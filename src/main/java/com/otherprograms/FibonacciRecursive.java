package com.otherprograms;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(fibonacci(number));
    }

    private static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
