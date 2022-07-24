package com.otherprograms;

import java.util.Arrays;


public class Intersection {

	public static void main(String[] args) {
		
		int x[] = {1,2,3,4,5,6};
		int y[] = {4,5,6,7,8,9};
		
		System.out.println("Value of X : "+Arrays.toString(x).replace("[", "").replace("]", ""));
		System.out.println("Value of y : "+Arrays.toString(y).replace("[", "").replace("]", ""));
		
		System.out.print("Intersection of X and Y is : " );
		for(int i=0; i<x.length;i++) {
			for(int j=0; j<y.length;j++) {
				if(x[i] == y[j]) {
					System.out.print(x[i]+", ");
				}
			}
		}
	}
}

/**
 *  Output:  Value of X : 1, 2, 3, 4, 5, 6
 *  		 Value of y : 4, 5, 6, 7, 8, 9
 *  		 Intersection of X and Y is : 4, 5, 6, 
 *
 */