package Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowestTwoNumbersUsingJava8 {
    public static void main(String[] args) {

        ArrayList<Integer> alist =
                new ArrayList<>(List.of(4, 8, 90, 65, 34, 77, 91, 23, 1, 6, 89, 80, 55, 43, 72, 43, 11, 13));

        List<Integer> highestTwoNumber = alist.stream()
                                  .sorted((a, b) -> Integer.compare(b, a))
                                  .limit(2)
                                  .collect(Collectors.toList());
        System.out.println(highestTwoNumber);

        List<Integer> lowestTwoNumbers = alist.stream()
                                  .sorted()
                                  .limit(2)
                                  .collect(Collectors.toList());
        System.out.println(lowestTwoNumbers);
    }
}
