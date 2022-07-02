package com.concept;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

		System.out.println("");

		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous());
		}
	}
}

/*
 * 	Output:	 	ABCDE
 * 				EDCBA
 */
