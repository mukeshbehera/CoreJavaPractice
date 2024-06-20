package com.java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamAPIQuestions {

    public static void main(String[] args) {

        // collect employees in Map where Key is employeeId and Value is employeeSalary
        // whose salary is greater than 30000
        method1();

        //use of parallelSteam
        method2();

        //reverse a string
        method3();

        //reverse only the words of a string
        method4();

        //find the most repeated character
        method5();

        //number of repetition of characters
        method6();

        //find duo whose sum is 14
        method7();

        //find the repetition of string
        method8();

        //sort the data based on the frequency
        method9();
    }

    private static void method9() {
        int[] array = {2,3,3,1,1,2,2,2,4,6,5,5,5,6,6,0,7};
        List<Integer> collect1 = Arrays.stream(array)
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
    }

    private static void method8() {
        String[] array = {"Hi", "Hi", "Bye", "Do", "Bye", "Do"};
        Map<String, Long> collect = Arrays.stream(array)
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        System.out.println("\n");
    }

    private static void method7() {
        int[] array = {73,7,10,70,63,17,4,5,24,12,15,65,35,45};
        int target = 80;
        Set<Integer> set = Arrays.stream(array)
                                 .boxed()
                                 .collect(Collectors.toSet());

        for(int num : array){
            int i = target - num;
            if (set.contains(i)){
                System.out.println(num + " : " + i);
            }
            set.remove(num);
        }
        System.out.println("\n");

//        Arrays.stream(array).reduce((element1, element2) -> {})
    }

    private static void method6() {
        String string = "laldldldlaa";
        Map<Character, Long> repetitionOfCharacters =
                string.chars()
                      .mapToObj(c -> (char) c)
                      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(repetitionOfCharacters);
        System.out.println("\n");
    }

    private static void method5() {
        String string = "laldldldlaa";
        Map.Entry<Character, Long> characterLongEntry =
                string.chars()
                      .mapToObj(c -> (char) c)
                      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                      .entrySet()
                      .stream()
                      .max(Map.Entry.comparingByValue())
                      .get();
        System.out.println(characterLongEntry);
        System.out.println("\n");
    }

    private static void method4() {
        String string = "Mukesh Kumar Behera";
        String reverseWords = Arrays.stream(string.split(" "))
                               .map(word -> new StringBuilder(word).reverse().toString())
                               .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                                   Collections.reverse(list);
                                   return list.stream();
                               }))
                               .collect(Collectors.joining(" "));
        System.out.println(reverseWords);
        System.out.println("\n");
    }

    private static void method3() {
        String string = "Mukesh Kumar Behera";
        String reverseString = Arrays.stream(string.split(" "))
                               .map(word -> new StringBuilder(word).reverse().toString())
                               .collect(Collectors.joining(" "));
        System.out.println(reverseString);
        System.out.println("\n");
    }

    private static void method2() {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Emily", "Anna");

        names.parallelStream()
             .forEach(string -> {
                 System.out.println("Thread: " + Thread.currentThread().getName() +" : " + string);
             });
        System.out.println("\n");
    }

    private static void method1() {
        List<Emp> employees = Arrays.asList(
                new Emp(1, "John Doe", 50000),
                new Emp(2, "Jane Smith", 60000),
                new Emp(3, "Jack Johnson", 70000)
                                           );
        Map<Long, Double> filteredEmployees = employees.stream()
                                             .filter(emp -> emp.getSalary() > 30000)
                                             .collect(Collectors.toMap(Emp::getId, Emp::getSalary));
        System.out.println(filteredEmployees);
        System.out.println("\n");
    }
}
