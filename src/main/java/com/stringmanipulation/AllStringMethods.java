package com.stringmanipulation;

public class AllStringMethods {

	public static void main(String[] args) {

		String str = "rattaiah how r you";
		System.out.println(str.endsWith("u")); // true
		System.out.println(str.endsWith("how")); // false
		System.out.println(str.startsWith("d")); // false
		System.out.println(str.startsWith("r")); // true
		String s = "ratan how r u";
		System.out.println(s.substring(2)); // tan how r u
		System.out.println(s.substring(1, 7)); // atan h
		System.out.println("ratansoft".substring(2, 5)); // tan
	}
}

/*
 *  Output:  true
 *  		 false
 *  		 false
 *  		 true
 *  		 tan how r u
 *  		 atan h
 *  		 tan
 */