
package com.stringmanipulation;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseUsingCollection {

	public static void main(String[] args) {
		
		String str = "Mukesh Kumar Behera";
		String[] strArr = str.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		
		
		for(String st:strArr) {
			al.add(st);
		}
		
		Collections.reverse(al);
		
		
		System.out.println(al.toString().replace("[", "").replace("]", "").replace(",", ""));
	}
}
