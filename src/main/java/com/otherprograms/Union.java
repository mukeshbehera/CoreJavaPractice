package com.otherprograms;

import java.util.Arrays;

public class Union {

	static int value1[]={1,2,3,4,5,6};
	static int value2[]={4,5,6,7,8};
	
	public static void main(String[] args) {
		
		System.out.println("1st Value is : "+Arrays.toString(value1).replace("[", "").replace("]", ""));
		System.out.println("2nd Value is : "+Arrays.toString(value2).replace("[", "").replace("]", ""));
		
		//printing the union value
		System.out.print("Union Value is : ");
		for(int i=0; i<value1.length; i++) {
			for(int j=0; j<value2.length; j++) {
				if(value1[i] == value2[j]) {
					System.out.print(value1[i]+", ");
				}
			}
		}
	}
}
