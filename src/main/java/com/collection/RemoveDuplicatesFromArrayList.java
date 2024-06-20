package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 7, 9, 10));

        // Approach 1
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(alist);
        ArrayList<Integer> duplicatesRemoved = new ArrayList<>(hashSet);
        System.out.println(duplicatesRemoved);

        //Approach 2
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Iterator<Integer> iterator = alist.iterator();
        while (iterator.hasNext()){
            Integer currentValue = iterator.next();
            if (newArrayList.contains(currentValue)){
                iterator.remove();
            } else {
                newArrayList.add(currentValue);
            }
        }
        System.out.println(newArrayList);

        // Approach 3 (Using Java 8 Stream feature)
        List<Integer> streamRemovedDuplicates = alist.stream()
                                     .distinct()
                                     .collect(Collectors.toList());
        System.out.println(streamRemovedDuplicates);
    }
}
