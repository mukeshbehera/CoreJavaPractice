package com.arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {

        int firstElement = 1;
        int secondElement = 2;
        int limit = 10;

        List<Integer> fibonacci = Stream.iterate(new int[]{firstElement, secondElement},
                                               arr -> new int[]{arr[1], arr[0] + arr[1]})
                                      .limit(limit)
                                      .map(ints -> ints[0])
                                      .collect(Collectors.toList());
        System.out.println(fibonacci);
    }
}
