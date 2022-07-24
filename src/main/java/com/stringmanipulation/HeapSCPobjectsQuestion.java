package com.stringmanipulation;

public class HeapSCPobjectsQuestion {

	public static void main(String[] args) {
		
		String s1 = new String("You Can't Change Me");
		String s2 = new String("You Can't Change Me");
		System.out.println(s1 == s2); //false
		
		String s3 = "You Can't Change Me";
		System.out.println(s1 == s3); //false
		
		String s4 = "You Can't Change Me";
		System.out.println(s3 == s4); //true
		
		String s5 = "You Can't " + "Change Me";
		// If both are constants, that operation will be performed at compile time only.
		System.out.println(s4 == s5); //true
		
		String s6 = "You Can't ";
		String s7 = s6 + "Change Me";
		//If atleast one is normal variable, that operation will be performed at runtime only.
		System.out.println(s4 == s7); //false
		
		final String s8 = "You Can't ";  //final means constant
		String s9 = s8 + "Change Me";
		//Every final variable will be replaced by the value by compiler t compile time only.
		//Coz both are constants, the plus operation will be performed at compile time only.
		System.out.println(s4 == s9);
	}
}

/*
 *  Output:  false
 *  		 false
 *  		 true
 *  		 true
 *  		 false
 *  		 true
 */