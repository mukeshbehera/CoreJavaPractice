package com.otherprograms;

import java.util.Arrays;
import java.util.HashSet;


public class Intersection {

	public static void main(String[] args) {
		
		int[] x = {1, 2, 3, 4, 5, 6};
		int[] y = {4, 5, 6, 7, 8, 9};
		
		System.out.println("Value of X : "+Arrays.toString(x).replace("[", "").replace("]", ""));
		System.out.println("Value of y : "+Arrays.toString(y).replace("[", "").replace("]", ""));

		// approach 1
		appraoch1(x, y);

		System.out.println();

		// approach 2
		appraoch2(x, y);
	}

	private static void appraoch2(int[] x, int[] y) {
		HashSet<Integer> setX = new HashSet<>();
		for (int num : x) {
			setX.add(num);
		}

		// Find intersection
		System.out.print("Intersection of X and Y is: ");
		boolean found = false;
		for (int num : y) {
			if (setX.contains(num)) {
				System.out.print(num + ", ");
				found = true;
			}
		}

		if (!found) {
			System.out.print("No intersection found.");
		}
	}

	private static void appraoch1(int[] x, int[] y) {
		System.out.print("Intersection of X and Y is: " );
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < y.length; j++) {
				if(x[i] == y[j]) {
					System.out.print(x[i] + ", ");
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