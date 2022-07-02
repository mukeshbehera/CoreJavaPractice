package com.stringmanipulation;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String str = "hi ratan w r u wt bout anushka";
		StringTokenizer st = new StringTokenizer(str); // split the string with by default (space symbol)

		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		// used our string to split giver String
		String str1 = "hi,rata,mf,sdfsdf,ara";
		StringTokenizer st1 = new StringTokenizer(str1, ",");

		while (st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}
	}
}
