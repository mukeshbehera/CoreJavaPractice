package com.arrays;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6};
		int[] y = {6,7,5,8,9,4,12,16}; //4,5,6
		
		System.out.println("Value of X is: "+ Arrays.toString(x).replace("[", "").replace("]", ""));
		System.out.println("Value of y is: "+ Arrays.toString(y).replace("[", "").replace("]", ""));
		System.out.print("Intersection of X & Y is: ");
		
		
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				if(x[i] == y[j]) {
					System.out.print(x[i]+",");
				}
			}
		}
	}
}
