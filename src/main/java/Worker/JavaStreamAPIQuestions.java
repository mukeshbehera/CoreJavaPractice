package Worker;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamAPIQuestions {

    record Worker(int id, String name, double salary, String department) {
        // Optionally, you can add methods or override toString, equals, hashCode if needed.
    }

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

        //print only non vowel (consonants)
        method10();

        //find the average salary of all the employees whose department is Computer Science
        method11();

        //find the 3 highest paid worker of each department
        method12();

        //Strings based on the length
        method13();

        //first non repeated character
        method14();
    }

    private static void method14() {
        String string = "management";

        Character c = string.chars()
                            .mapToObj(ch -> (char) ch)
                            .collect(Collectors.groupingBy(Function.identity(),
                                                           LinkedHashMap::new,
                                                           Collectors.counting()))
                            .entrySet()
                            .stream()
                            .filter(entry -> entry.getValue() == 1)
                            .map(Map.Entry::getKey)
                            .findFirst()
                            .get();
        System.out.println("First non repeated character: " + c);
    }

    private static void method13() {
        System.out.println("Strings based on the length");
        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};

        Map<Integer, List<String>> collect = Arrays.stream(strings)
                                                   .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }

    private static void method12() {
        List<Worker> workersList = List.of(
                // IT Department
                new Worker(1, "Alice", 120000.00, "IT"),
                new Worker(2, "Bob", 110000.00, "IT"),
                new Worker(3, "Charlie", 105000.00, "IT"),
                new Worker(4, "David", 95000.00, "IT"),
                new Worker(5, "Eve", 80000.00, "IT"),
                // HR Department
                new Worker(6, "Fiona", 85000.00, "HR"),
                new Worker(7, "George", 87000.00, "HR"),
                new Worker(8, "Hannah", 90000.00, "HR"),
                new Worker(9, "Ian", 75000.00, "HR"),
                new Worker(10, "Jackie", 72000.00, "HR"),
                // Finance Department
                new Worker(11, "Kiran", 130000.00, "Finance"),
                new Worker(12, "Liam", 125000.00, "Finance"),
                new Worker(13, "Mira", 115000.00, "Finance"),
                new Worker(14, "Nina", 95000.00, "Finance"),
                new Worker(15, "Oscar", 90000.00, "Finance"));

        //method1
        workersList.stream()
                   .collect(Collectors.groupingBy(Worker::department,
                                                  Collectors.collectingAndThen(Collectors.toList(),
                                                                               workers -> workers.stream()
                                                                                                 .sorted(Comparator.comparing(Worker::salary)
                                                                                                                   .reversed())
                                                                                                 .limit(3)
                                                                                                 .collect(Collectors.toList()))))
                   .forEach((department, workers) -> {
                       System.out.println(department);
                       System.out.println("----------------");
                       for (Worker worker : workers) {
                           System.out.println(worker.name() + " : " + worker.salary());
                       }
                       System.out.println();
                   });

        //method2
        workersList.stream()
                   .collect(Collectors.groupingBy(Worker::department))
                   .entrySet()
                   .stream()
                   .collect(Collectors.toMap(Map.Entry::getKey, // Department name
                                             entry -> entry.getValue()
                                                           .stream()
                                                           .sorted(Comparator.comparingDouble(Worker::salary)
                                                                             .reversed()) // Sort by salary descending
                                                           .limit(3) // Take the top 3
                                                           .toList() // Collect as a list
                                            ))
                   .forEach((department, workers) -> {
                       System.out.println(department);
                       System.out.println("----------------");
                       workers.forEach(worker -> System.out.println("  " + worker.name() + " - " + worker.salary()));
                       System.out.println();
                   });
    }

    private static void method11() {
        List<Employees> employees = Arrays.asList(
                new Employees(1, "John", 101, 60000),
                new Employees(2, "Jane", 102, 75000),
                new Employees(3, "Jack", 101, 80000),
                new Employees(4, "Jill", 103, 90000)
                                                 );

        List<Department> departments = Arrays.asList(
                new Department(101, "Computer Science"),
                new Department(102, "Electrical Engineering"),
                new Department(103, "Mechanical Engineering")
                                                    );
        //approach 1
        Integer departmentId = departments.stream()
                                     .filter(department -> department.getDepName()
                                                                     .equalsIgnoreCase("Computer Science"))
                                     .map(Department::getDepId)
                                     .findFirst()
                                     .orElseThrow(() -> new RuntimeException("Department Not Found"));
        Double averageSalary1 = employees.stream()
                                  .filter(employee -> employee.getDepId() == departmentId)
                                  .collect(Collectors.averagingDouble(Employees::getSalary));
        System.out.println("Average Salary Of Computer Science Department is : " + averageSalary1);

        //approach 2
        Double averageSalary2 = employees.stream()
                                  .filter(emp -> departments.stream()
                                                            .anyMatch(dep -> dep.getDepId() == emp.getDepId()
                                                                             && dep.getDepName()
                                                                                   .equalsIgnoreCase("Computer Science")))
                                  .collect(Collectors.averagingDouble(Employees::getSalary));
        System.out.println("Average Salary Of Computer Science Department is : " + averageSalary2);
        System.out.println("\n");
    }

    private static void method10() {
        String string = "hdtakewlcndgetaedf";
        String collect = string.chars()
                               .mapToObj(character -> (char) character)
                               .filter(character -> "aeiouAEIOU".indexOf(character) == -1)
                               .map(String::valueOf)
                               .collect(Collectors.joining());
        System.out.println(collect);
        System.out.println("\n");
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
        System.out.println("\n");
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
                                    .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                                        Collections.reverse(list);
                                        return list.stream();
                                    }))
                                    .collect(Collectors.joining(" "));
        System.out.println(reverseWords);

        String reverse = Arrays.stream(string.split(" "))
                               .map(s -> new StringBuilder(s).reverse())
                               .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                                   Collections.reverse(list);
                                   return list.stream();
                               }))
                               .collect(Collectors.joining(" "));
        System.out.println(reverse);
        System.out.println("\n");
    }

    private static void method3() {
        String string = "Mukesh Kumar Behera";
        String reverseString = Arrays.stream(string.split(" "))
                                     .map(s -> new StringBuilder(s).reverse())
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
