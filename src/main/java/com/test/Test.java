package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
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
		System.out.println("Find the second highest salary");
		Employee secondHighestSalary = employeeList.stream()
									   .sorted(Comparator.comparing(Employee::getSalary).reversed())
									   .skip(1)
									   .findFirst()
									   .get();
		System.out.println("Name: "+secondHighestSalary.getName());
		System.out.println("Salary: "+secondHighestSalary.getSalary());
	}

	private static void method15() {
		System.out.println("Who is the oldest employee in the organization? What is his age? and Which department he belongs to?");
		Employee oldestEmployee = employeeList.stream()
								  .max(Comparator.comparing(Employee::getAge))
								  .get();
		System.out.println("Name: "+oldestEmployee.getName());
		System.out.println("Age: "+oldestEmployee.getAge());
		System.out.println("Department: "+oldestEmployee.getDepartment());
	}

	private static void method14() {
		System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
		Map<Boolean, List<Employee>> partitionEmployeeByAge = 
				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeeByAge.entrySet();
		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			if (entry.getKey()) {
				System.out.println("Employees Older Than 25");
			}
			else {
				System.out.println("Employees Younger than or equal to 25 years");
			}
			System.out.println("----------------------------------------------");
			List<Employee> listOfEmployee = entry.getValue();
			for(Employee employee:listOfEmployee) {
				System.out.println(employee.getName());
			}
			System.out.println("");
		}
	}

	private static void method13() {
		System.out.println("What is the average salary and total salary of the whole organization");
		DoubleSummaryStatistics averageAndTotalSalaryOfWholeOrganization = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average: "+averageAndTotalSalaryOfWholeOrganization.getAverage());
		System.out.println("Total: "+averageAndTotalSalaryOfWholeOrganization.getSum());
	}

	private static void method12() {
		System.out.println("List down the names of all employees in each department");
		Map<String, List<Employee>> employeesInEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet = employeesInEachDepartment.entrySet();
		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println(entry.getKey()+":");
			System.out.println("------------------------------");
			List<Employee> listOfEmployees = entry.getValue();
			for(Employee employee:listOfEmployees) {
				System.out.println(employee.getName());
			}
			System.out.println("\n");
		}
	}

	private static void method11() {
		System.out.println("What is the average salary of male and female employee");
		Map<String, Double> averageSalaryMaleFemaleEmployee = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrySet = averageSalaryMaleFemaleEmployee.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	private static void method10() {
		System.out.println("how many male and female employees are there in the sales and marketing team");
		Map<String, Long> numberOfMaleFemaleInSalesAndMarketing = 
				employeeList.stream()
				.filter(e -> e.getDepartment()=="Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		Set<Entry<String, Long>> entrySet = numberOfMaleFemaleInSalesAndMarketing.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	private static void method9() {
		System.out.println("Who has the most working experience in the organization");
		Employee mostExperiencesEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst()
				.get();
		System.out.println(mostExperiencesEmployee);
	}

	private static void method8() {
		System.out.println("get the details of youngest male employee in the product development department");
		Employee youngestEmployee = 
				employeeList.stream().filter(e -> e.getGender().equalsIgnoreCase("male") && e.getDepartment().equalsIgnoreCase("product development"))
							 .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)))
							 .get();
		System.out.println("Name: "+youngestEmployee.getName());
		System.out.println("Name: "+youngestEmployee.getAge());
		System.out.println("Name: "+youngestEmployee.getSalary());
	}

	private static void method7() {
		System.out.println("what is the average salary of each department");
		Map<String, Double> averageSalaryEachDepartment = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrySet = averageSalaryEachDepartment.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
	}

	private static void method6() {
		System.out.println("count the number of employees in each department");
		Map<String, Long> numberOfEmployeesEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = numberOfEmployeesEachDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}

	private static void method5() {
		System.out.println("get the names of all employees who have joined after 2015");
		employeeList.stream().filter(e -> e.getYearOfJoining()>2015).map(Employee::getName)
							 .forEach(System.out::println);
		
	}

	private static void method4() {
		System.out.println("get the details of highest paid employee");
		Employee highestPaidEmployee = 
				employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
				.get();
		System.out.println("Name: "+highestPaidEmployee.getName());
		System.out.println("Salary: "+highestPaidEmployee.getSalary());
	}

	private static void method3() {
		System.out.println("What is the average age of female and male employees");
		Map<String, Double> averageAgeOfMaleFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(averageAgeOfMaleFemaleEmployees);
	}

	private static void method2() {
		System.out.println("Print the name of all departments");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	private static void method1() {
		System.out.println("How many male and female employees are there in the organization");
		Map<String, Long> maleFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleFemaleEmployees);
	}
}
