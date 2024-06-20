package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6};
		int[] y = {6,7,5,8,9,4,12,16}; //4,5,6
		
		System.out.println("Value of X is: "+ Arrays.toString(x).replace("[", "").replace("]", ""));
		System.out.println("Value of y is: "+ Arrays.toString(y).replace("[", "").replace("]", ""));

		System.out.println("Intersection: " + findIntersection(x,y));
		System.out.println("Using Stream: " + findIntersectionUsingStream(x,y));
		System.out.println("Using Stream Time Complexity: " + findIntersectionUsingStreamTimeComplexity(x,y));
		System.out.println("Using Set Time Complexity: " + findIntersectionUsingSetTimeComplexity(x,y));

	}

	private static ArrayList<Integer> findIntersection(int[] x, int[] y) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				if(x[i] == y[j]) {
					al.add(x[i]);
				}
			}
		}

		return al;
	}

	// Using Stream
	private static ArrayList<Integer> findIntersectionUsingStream(int[] x, int[] y) {
		return Arrays.stream(x)
					 .filter(xValue -> Arrays.stream(y).anyMatch(yValue -> xValue == yValue))
					 .boxed()
					 .collect(Collectors.toCollection(ArrayList::new));
	}

	// Using Stream - Time Complexity
	private static ArrayList<Integer> findIntersectionUsingStreamTimeComplexity(int[] x, int[] y) {
		HashSet<Integer> ySet = Arrays.stream(y)
									  .boxed()
									  .collect(Collectors.toCollection(HashSet::new));
		return Arrays.stream(x)
					 .filter(ySet::contains)
					 .boxed()
					 .collect(Collectors.toCollection(ArrayList::new));
	}

	// Using Set - Time Complexity
	// retainAll method used to retain only the elements that are common between two sets
	private static ArrayList<Integer> findIntersectionUsingSetTimeComplexity(int[] x, int[] y) {
		Set<Integer> xSet = Arrays.stream(x)
								  .boxed()
								  .collect(Collectors.toSet());
		xSet.retainAll(Arrays.stream(y)
							 .boxed()
							 .collect(Collectors.toSet()));
		return new ArrayList<>(xSet);
	}
}

/*
 *  Output: Value of X is: 1, 2, 3, 4, 5, 6
			Value of y is: 6, 7, 5, 8, 9, 4, 12, 16
			Intersection: [4, 5, 6]
			Using Stream: [4, 5, 6]
			Using Stream Time Complexity: [4, 5, 6]
			Using Set Time Complexity: [4, 5, 6]
 */