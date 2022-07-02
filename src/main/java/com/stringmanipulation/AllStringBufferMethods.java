package com.stringmanipulation;

public class AllStringBufferMethods {

	public static void main(String[] args) {

		// delete, deleteCharAt, reverse
		StringBuffer sb = new StringBuffer("Mukesh");
		System.out.println(sb);
		System.out.println(sb.delete(1, 3));
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(1));
		System.out.println(sb.reverse());

		
		// append
		StringBuffer sb1 = new StringBuffer("Mukesh");
		String str = " salary ";
		int a = 60000;
		sb1.append(str);
		sb1.append(a);
		System.out.println(sb1);

		
		// insert
		StringBuffer sb2 = new StringBuffer("ratan");
		sb2.insert(0, "hi ");
		System.out.println(sb2);

		
		// indexOf, lastIndexOf
		StringBuffer sb3 = new StringBuffer("hi ratan hi");
		int i;
		i = sb3.indexOf("hi");
		System.out.println(i);
		i = sb3.lastIndexOf("hi");
		System.out.println(i);

		
		// replace
		StringBuffer sb4 = new StringBuffer("hi Mukesh hi");
		sb4.replace(0, 2, "oy");
		System.out.println("after replaceing the string:-" + sb4);
	}
}
