package com.core.comparator;

import java.util.ArrayList;
import java.util.Collections;

/*
 * In this class we are printing the values of the object by sorting on the basics of name and age.
*/
public class TestComparator {
	public static void main(String[] args) {
		//creating list of employees
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Mukesh", 30));
		al.add(new Employee(102, "Muntesh", 31));
		al.add(new Employee(103, "Luthu", 28));
		
		System.out.println("Sorting by Name");
		//Using NameComarator to sort the elements
		Collections.sort(al, new NameComparator());
		//Traversing the elements of list
		for(Employee em:al) {
			System.out.println(em.id+" "+em.name+" "+em.age);
		}
		
		
		
		System.out.println("sorting by Age");
		//using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		//Traversing the list again
		for(Employee em:al) {
			System.out.println(em.id+" "+em.name+" "+em.age);
		}
		
		
		System.out.println("sorting by ID");
		//using IdComparator to sort the elements
		Collections.sort(al, new IdComparator());
		//Traversing the list again
		for(Employee em:al) {
			System.out.println(em.id+" "+em.name+" "+em.age);
		}
	}
}
