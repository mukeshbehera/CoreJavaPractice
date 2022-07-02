package com.stringmanipulation;

public class SpaceCount {

	
	
	public static void main(String[] args) {
		
		String str = "My Name is Khan And I am Not a Terrorist";
		
		
		//logic for space count
		String[] strArr = str.split(" ");

		
		//printing no of space
		System.out.println("No of space is : "+(strArr.length-1));
	}
}
