package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamPractice {
	
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {
		
		employeeList.add(new Employee(199, "Amelia Joe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2016, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.0));
		employeeList.add(new Employee(255, "Alia Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "John Paulo", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization
		method1();
		System.out.println("\n");

		// Print the name of all departments
		method2();
		System.out.println("\n");

		// What is the average age of female and male employees
		method3();
		System.out.println("\n");

		// get the details of highest paid employee
		method4();
		System.out.println("\n");

		// get the names of all employees who have joined after 2015
		method5();
		System.out.println("\n");

		// count the number of employees in each department
		method6();
		System.out.println("\n");

		// what is the average salary of each department
		method7();
		System.out.println("\n");

		// get the details of youngest male employee in the product development department
		method8();
		System.out.println("\n");

		// Who has the most working experience in the organization
		method9();
		System.out.println("\n");

		// how many male and female employees are there in the sales and marketing team
		method10();
		System.out.println("\n");

		// What is the average salary of male and female employee
		method11();
		System.out.println("\n");

		// List down the names of all employees in each department
		method12();
		System.out.println("\n");

		// What is the average salary and total salary of the whole organization
		method13();
		System.out.println("\n");

		// Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years
		method14();
		System.out.println("\n");

		// Who is the oldest employee in the organization? What is his age? and Which
		// department he belongs to?
		method15();
		System.out.println("\n");
		
		//Find the second highest salary
		method16();
		System.out.println("\n");
	}

	private static void method16() {
		System.out.println("second highest salary");
		Employee employee = employeeList.stream()
										.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
										.skip(1)
										.findFirst()
										.get();
		System.out.println(employee);
	}

	private static void method15() {
		System.out.println("oldest employee in the organization");
		Employee employee = employeeList.stream()
										.max(Comparator.comparing(Employee::getAge))
										.get();
		System.out.println(employee);
	}

	private static void method14() {
		System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
		employeeList.stream()
				.collect(Collectors.partitioningBy(employee -> employee.getAge() <= 25))
				.forEach((aBoolean, employees) -> {
					if (aBoolean) {
						System.out.println("Employees younger or equal to 25 years");
					} else {
						System.out.println("Employees older than 25 years");
					}
					System.out.println("----------------------------------------");
					employees.forEach(System.out::println);
					System.out.println();
				});
	}

	private static void method13() {
		System.out.println("average salary and total salary of the whole organization");
		DoubleSummaryStatistics collect = employeeList.stream()
													  .collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary: " + collect.getAverage());
		System.out.println("Total Salary: " + collect.getSum());
	}

	private static void method12() {
		System.out.println("names of all employees in each department");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
											   Collectors.mapping(Employee::getName, Collectors.toList())))
				.forEach((department, names) -> {
					System.out.println(department);
					System.out.println("---------------------------");
					names.forEach(System.out::println);
					System.out.println();
				});
	}

	private static void method11() {
		System.out.println("average salary of male and female employee");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((s, aDouble) -> System.out.println(s + " : " + aDouble));
	}

	private static void method10() {
		System.out.println("male and female employees in the sales and marketing team");
		employeeList.stream()
				.filter(employee -> employee.getDepartment().equalsIgnoreCase("sales and marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((s, aLong) -> System.out.println(s + " : " + aLong));
	}

	private static void method9() {
		System.out.println("most working experience in the organization");
		Employee employee = employeeList.stream()
										.min(Comparator.comparing(Employee::getYearOfJoining))
										.get();
		System.out.println(employee);
	}

	private static void method8() {
		System.out.println("details of youngest male employee in the product development department");
		Employee employee1 = employeeList.stream()
                                         .filter(employee -> employee.getDepartment().equalsIgnoreCase("product development")
                                                             && employee.getGender().equalsIgnoreCase("male"))
                                         .min(Comparator.comparing(Employee::getAge))
                                         .get();
		System.out.println(employee1);
	}

	private static void method7() {
		System.out.println("average salary of each department");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((s, aDouble) -> System.out.println(s + " : " + aDouble));
	}

	private static void method6() {
		System.out.println("number of employees in each department");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.forEach((s, aLong) -> System.out.println(s + " : " + aLong));
	}

	private static void method5() {
		System.out.println("names of all employees who have joined after 2015");
		employeeList.stream()
				.filter(employee -> employee.getYearOfJoining() > 2015)
				.forEach(employee -> System.out.println(employee));
	}

	private static void method4() {
		System.out.println("details of highest paid employee");
		Employee employee = employeeList.stream()
										.max(Comparator.comparingDouble(Employee::getSalary))
										.get();
		System.out.println(employee);
	}

	private static void method3() {
		System.out.println("average age of female and male employees");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((s, aDouble) -> System.out.println(s + " : " + aDouble));
	}

	private static void method2() {
		System.out.println("name of all departments");
		employeeList.stream()
				.map(Employee::getDepartment)
				.distinct()
				.forEach(System.out::println);
	}

	private static void method1() {
		System.out.println("Number of male and female employees are there in the organization");
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((s, aLong) -> {
					System.out.println(s + " : " + aLong);
				});
	}
}
