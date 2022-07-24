package com.stringmanipulation;

public class SpaceCount {

	public static void main(String[] args) {
		
		//Method 1
		String str = "My Name is Khan And I am Not a Terrorist";
		String[] strArr = str.split(" ");
		System.out.println("No of space Using Method1: "+(strArr.length-1));
		
		
		
		//Method 2
		String string = "My Name is Khan And I am Not a Terrorist   "; //three spaces after the string
		char[] charArr = string.toCharArray();
		int count = 0;
		for (int i=0; i<charArr.length; i++) {
			if (charArr[i] == ' ') {
				count++;
			}
		}
		System.out.println("No of space Using Method2: "+count);
	}
}

/**
 * 	  Output: No of space Using Method1: 9
 * 			  No of space Using Method2: 12
 */