package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutNumbersArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>(List.of(1, 2, 3, 2, 3, 4, 5, 22, 33, 34, 4, 1, 2, 3, 4, 5));

        List<Integer> filteredNumbers = alist.stream()
                                     .filter(number -> !(number == 2 || number == 3 || number == 4))
                                     .collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }
}
