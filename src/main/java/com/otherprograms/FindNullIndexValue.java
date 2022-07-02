package com.otherprograms;

public class FindNullIndexValue {

	public static void main(String args[]) {
		String[] str = new String[4];
		str[0] = "Mukesh";
		str[1] = "Behera";
		str[2] = null;
		str[3] = "Padampur";
		
		for(int i=0; i<str.length; i++) {
			if(str[i]==null) {
				System.out.println("Null Index is: "+i);
			}
		}
	}
}
