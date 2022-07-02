package com.concept;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//iterator to traverse the list
		Iterator iterator = list.iterator(); //iterator can traverse in only forward direction
		
		System.out.println("List Elements: ");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		
	}
}
