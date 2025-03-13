package Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
*  Occurrence of numbers using java 8 features
* */
public class OccurrencesOfIntValues {

    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>(List.of(23,12,1,45,34,23,12,5,6,7,8,4,3,2,1,8,9,3,4,15,55,6,4,5,7));


        // Occurrence of all elements
        Map<Integer, Long> occurence1 = alist.stream()
                                          .collect(Collectors.groupingBy(i -> i,TreeMap::new, Collectors.counting()));

        //.collect(Collectors.groupingBy(i -> i,TreeMap::new, Collectors.counting()));
        System.out.println(occurence1);


        // Elements having occurrence more than 1
        Map<Integer, Long> occurence2 = alist.stream()
                                          .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                                          .entrySet()
                                          .stream()
                                          .filter(entry -> entry.getValue() > 1)
                                          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1, TreeMap::new));

        System.out.println(occurence2);
    }
}
