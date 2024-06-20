
package com.stringmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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


		// method 2
		Collections.reverse(al);

		List<Character> list = str.chars()
								  .mapToObj(c -> (char) c)
								  .collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
	}
}
