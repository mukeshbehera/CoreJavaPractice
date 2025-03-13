package Worker;

import java.util.stream.IntStream;

public class FactorialUsingJava8Features {

    public static void main(String[] args) {

        int number = 5;

        int factorial = IntStream.rangeClosed(1, number)
                              .reduce(1, (x, y) -> x * y);
        System.out.println(factorial);
    }
}
