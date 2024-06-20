package com.java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ttest {

    public static void main(String[] args) {

        /*String string = "Mukesh Kumar Behera";

        String collect = Arrays.stream(string.split(" "))
                               .map(word -> new StringBuilder(word).reverse().toString())
                               .collect(Collectors.joining(" "));
        System.out.println(collect);

        String collect1 = Arrays.stream(string.split(" "))
                                .map(word -> new StringBuilder(word).reverse().toString())
                                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                                    Collections.reverse(list);
                                    return list.stream();
                                }))
                                .collect(Collectors.joining(" "));
        System.out.println(collect1);*/

        //----------------------------------------------------------------------------------------------------------------

        //getting pairs for int array having sum of 80
        int[] array = {73,7,10,70,63,17,4,5,24,12,15,65,35,45};
        int target = 80;
        Set<Integer> set = Arrays.stream(array)
                                 .boxed()
                                 .collect(Collectors.toSet());
        for (int num : array){
            int i = target - num;
            if (set.contains(i)){
                System.out.println(num + " : " + i);
            }
            set.remove(num);
        }

        //----------------------------------------------------------------------------------------------------------------

        String[] strings = {"Hi","Hi","Hello","Hello","This","This"};
        Map<String, Long> collect = Arrays.stream(strings)
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Map<String, Integer> hasMap = new HashMap<>();
        for (String str : strings){
            if (hasMap.containsKey(str)){
                hasMap.put(str, hasMap.get(str) + 1);
            } else {
                hasMap.put(str, 1);
            }
        }
        System.out.println(hasMap);

        //----------------------------------------------------------------------------------------------------------------


        int[] numbers = {2, 3, 3, 1, 1, 2, 2, 2, 4, 6, 5, 5, 5, 6, 6, 0, 7};
        List<Integer> collect1 = Arrays.stream(numbers)
                                       .boxed()
                                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                       .entrySet()
                                       .stream()
                                       .sorted(Map.Entry.<Integer, Long>comparingByValue()
                                                        .thenComparing(Map.Entry.comparingByKey()))
                                       .flatMap(entry -> Arrays.stream(new Integer[entry.getValue().intValue()])
                                                               .map(i -> entry.getKey()))
                                       .collect(Collectors.toList());
        System.out.println(collect1);

        int[] arr = {73,7,10,70,63,17,4,5,24,12,15,65,35,45};
        int target1 = 80;
        Set<Integer> set1 = Arrays.stream(arr)
                                  .boxed()
                                  .collect(Collectors.toSet());
        for (int num : arr){
            int i = target1 - num;
            if (set1.contains(i)){
                System.out.println(num + " : " + i);
            }
            set1.remove(num);
        }
    }
}
