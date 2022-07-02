package com.stringmanipulation;

public class ReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		
		String str = "Mukesh Kumar Behera";
		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer = stringBuffer.reverse();
		
		System.out.println(stringBuffer);
		
	}
}
