package com.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.java8features.Employee;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class StreamAPIExample {

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
		employeeList.add(new Employee(277, "Amelia Joe", 31, "Male", "Product Development", 2012, 35700.0));

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

	/**
	 * method 1
	 *
	 */
	private static void method1() {
		System.out.println("How many male and female employees are there in the organization");
		Map<String, Long> noOfMaleAndFemaleEmployees = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(noOfMaleAndFemaleEmployees);
	}

	/**
	 * method 2
	 *
	 */
	private static void method2() {
		System.out.println("Print the name of all departments");
				employeeList.stream()
							.map(Employee::getDepartment)
							.distinct()
							.forEach(System.out::println);
	}

	/**
	 * method 3
	 *
	 */
	private static void method3() {
		System.out.println("What is the average age of female and male employees");
		Map<String, Double> averageAgeOfMaleAndFemaleEmployees = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(averageAgeOfMaleAndFemaleEmployees);
	}

	/**
	 * method 4
	 *
	 */
	private static void method4() {
		System.out.println("get the details of highest paid employee");
		Employee highestPaidEmployee = 
				employeeList.stream()
							.sorted(Comparator.comparing(Employee::getSalary).reversed())
							.findFirst()
							.get();
				
//				employeeList.stream()
//							.max(Comparator.comparing(Employee::getSalary))
//							.get();
				
//				employeeList.stream()
//							.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
//							.get();
		System.out.println(highestPaidEmployee);
	}

	/**
	 * method 5
	 *
	 */
	private static void method5() {
		System.out.println("get the names of all employees who have joined after 2015");
				employeeList.stream()
							.filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
							.forEach(System.out::println);
	}

	/**
	 * method 6
	 *
	 */
	private static void method6() {
		System.out.println("count the number of employees in each department");
		Map<String, Long> employeeCountByDepartment = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	/**
	 * method 7
	 *
	 */
	private static void method7() {
		System.out.println("what is the average salary of each department");
		Map<String, Double> averageSalaryOfEachDepartment = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		Set<Entry<String, Double>> entrySet = averageSalaryOfEachDepartment.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	/**
	 * method 8
	 *
	 */
	private static void method8() {
		System.out.println("get the details of youngest male employee in the product development department");
		Employee youngestMaleEmployeeProductDevelopmentDepartment =
				employeeList.stream()
							.filter(e -> e.getDepartment()=="Product Development" && e.getGender()=="Male")
							.sorted(Comparator.comparing(Employee::getAge))
							.findFirst()
							.get();
				
//				employeeList.stream()
//							.filter(e -> e.getDepartment()=="Product Development" && e.getGender()=="Male")
//							.min(Comparator.comparing(Employee::getAge))
//							.get();
				
//				employeeList.stream()
//							.filter(e -> e.getDepartment()=="Product Development" && e.getGender()=="Male")
//							.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)))
//							.get();
		System.out.println(youngestMaleEmployeeProductDevelopmentDepartment);
	}

	/**
	 * method 9
	 *
	 */
	private static void method9() {
		System.out.println("Who has the most working experience in the organization");
		Employee seniorMostEmployee = 
				employeeList.stream()
							.sorted(Comparator.comparingInt(Employee::getYearOfJoining))
							.findFirst()
							.get();
		
//				employeeList.stream()
//							.min(Comparator.comparing(Employee::getYearOfJoining))
//							.get();
				
//				employeeList.stream()
//							.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)))
//							.get();
		System.out.println("-------------------------------------------");
		System.out.println("ID: " + seniorMostEmployee.getId());
		System.out.println("Name: " + seniorMostEmployee.getName());
		System.out.println("Joining Year: " + seniorMostEmployee.getYearOfJoining());
	}

	/**
	 * method 10
	 *
	 */
	private static void method10() {
		System.out.println("how many male and female employees are there in the sales and marketing team");
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = 
				employeeList.stream()
							.filter(e -> e.getDepartment() == "Sales And Marketing")
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
	}

	/**
	 * method 11
	 *
	 */
	private static void method11() {
		System.out.println("What is the average salary of male and female employee");
		Map<String, Double> averageSalaryOfMaleAndFemaleEmployees = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSalaryOfMaleAndFemaleEmployees);
	}

	/**
	 * method 12
	 *
	 */
	private static void method12() {
		System.out.println("List down the names of all employees in each department");
		Map<String, List<Employee>> employeeListByDepartment = 
				employeeList.stream()
							.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("");
			System.out.println("Employees in " + entry.getKey() + " : ");
			System.out.println("------------------------------");
			List<Employee> list = entry.getValue();
			for (Employee e : list) {
				System.out.println("Name: " + e.getName());
			}
		}
	}

	/**
	 * method 13
	 *
	 */
	private static void method13() {
		System.out.println("What is the average salary and total salary of the whole organization");
		DoubleSummaryStatistics employeeSummeryStatistics = 
				employeeList.stream()
							.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary: " + employeeSummeryStatistics.getAverage());
		System.out.println("Total Salary: " + employeeSummeryStatistics.getSum());
	}

	/**
	 * method 14
	 *
	 */
	private static void method14() {
		System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
		Map<Boolean, List<Employee>> partitionEmployeeByAge = 
				employeeList.stream()
							.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeeByAge.entrySet();
		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");
			if (entry.getKey()) {
				System.out.println("Employees Older Than 25 Years : ");
			} else {
				System.out.println("Employees Younger than or equal to 25 years");
			}
			System.out.println("------------------------------------");

			List<Employee> empList = entry.getValue();

			for (Employee emp : empList) {
				System.out.println(emp.getName());
			}
		}
	}

	/**
	 * method 15
	 *
	 */
	private static void method15() {
		System.out.println("Who is the oldest employee in the organization? What is his age? and Which department he belongs to?");
		Employee oldestEmployee = 
				employeeList.stream()
							.sorted(Comparator.comparing(Employee::getAge).reversed())
							.findFirst()
							.get();
//		Employee oldestEmployee = 
//				employeeList.stream()
//							.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)))
//							.get();
//		Employee oldestEmployee = 
//				employeeList.stream()
//							.max(Comparator.comparing(Employee::getAge))
//							.get();
		System.out.println("Name: "+oldestEmployee.getName());
		System.out.println("Age: "+oldestEmployee.getAge());
		System.out.println("Department: "+oldestEmployee.getDepartment());
	}
	

	/**
	 * method 16
	 *
	 */
	private static void method16() {
		System.out.println("Find the second highest salary");
		Employee secondHighestSalary = 
				employeeList.stream()
							.sorted(Comparator.comparing(Employee::getSalary).reversed())
							.skip(1)
							.findFirst()
							.get();
		
		System.out.println("Name: "+secondHighestSalary.getName());
		System.out.println("Salary: "+secondHighestSalary.getSalary());
	}

}



/**
 * OUTPUT:
 * -------
 * 
 * How many male and female employees are there in the organization
{Male=5, Female=4}


Print the name of all departments
Sales And Marketing
Security And Transport
Infrastructure
Product Development
Account And Finance


What is the average age of female and male employees
{Male=28.2, Female=26.0}


get the details of highest paid employee
Employee [id=277, name=Amelia Joe, age=31, gender=Male, department=Product Development, yearOfJoining=2012, salary=35700.0]


get the names of all employees who have joined after 2015
Amelia Joe
Jaden Dough
Nitin Joshi
Nicolus Den
Alia Baig


count the number of employees in each department
Product Development : 3
Security And Transport : 1
Sales And Marketing : 2
Infrastructure : 2
Account And Finance : 1


what is the average salary of each department
Product Development : 30933.333333333332
Security And Transport : 11000.5
Sales And Marketing : 11100.0
Infrastructure : 14200.0
Account And Finance : 21300.0


get the details of youngest male employee in the product development department
Employee [id=222, name=Nitin Joshi, age=25, gender=Male, department=Product Development, yearOfJoining=2016, salary=28200.0]


Who has the most working experience in the organization
-------------------------------------------
ID: 277
Name: Amelia Joe
Joining Year: 2012


how many male and female employees are there in the sales and marketing team
{Male=1, Female=1}


What is the average salary of male and female employee
{Male=19660.1, Female=19350.0}


List down the names of all employees in each department

Employees in Product Development : 
------------------------------
Name: Nitin Joshi
Name: Sanvi Pandey
Name: Amelia Joe

Employees in Security And Transport : 
------------------------------
Name: Jaden Dough

Employees in Sales And Marketing : 
------------------------------
Name: Amelia Joe
Name: Nicolus Den

Employees in Infrastructure : 
------------------------------
Name: Jasna Kaur
Name: Alia Baig

Employees in Account And Finance : 
------------------------------
Name: Jyothi Reddy


What is the average salary and total salary of the whole organization
Average Salary: 19522.277777777777
Total Salary: 175700.5


Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
--------------------------------------
Employees Younger than or equal to 25 years
------------------------------------
Amelia Joe
Nitin Joshi
Nicolus Den
Alia Baig
--------------------------------------
Employees Older Than 25 Years : 
------------------------------------
Jaden Dough
Jasna Kaur
Jyothi Reddy
Sanvi Pandey
Amelia Joe


Who is the oldest employee in the organization? What is his age? and Which department he belongs to?
Name: Jaden Dough
Age: 38
Department: Security And Transport


Find the second highest salary
Name: Sanvi Pandey
Salary: 28900.0
 *
 */