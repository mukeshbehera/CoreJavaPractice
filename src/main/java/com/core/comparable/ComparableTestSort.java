package com.core.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTestSort {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(103, "Luthu", 30));
		al.add(new Student(101, "Mukesh", 28));
		al.add(new Student(102, "Muntesh", 31));
		
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}
}
