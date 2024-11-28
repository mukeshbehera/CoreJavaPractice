package com.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintAlternateNumbers {

    public static void main(String[] args) {

        int[] arrays = {1,2,3,4,5,6,7,8,9};

        IntStream.range(0,arrays.length)
                .filter(index -> index%2 == 0)
                .map(i -> arrays[i])
                .forEach(System.out::println);
    }
}
