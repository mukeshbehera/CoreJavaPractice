package com.arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintEvenAndOdd {

	public static void main(String[] args) {
		
		System.out.println("EVEN: ");
		for (int i = 2; i < 50; i++) {
			if (i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n\nODD: ");
		for (int i = 2; i < 50; i++) {
			if (i%2 != 0) {
				System.out.print(i+" ");
			}
		}


		//Using Stream
		Map<Boolean, List<Integer>> oddEven = IntStream.rangeClosed(1, 50)
													   .boxed()
													   .collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println("\nEVEN: ");
		oddEven.get(true).forEach(integer -> System.out.print(integer + " "));

		System.out.println("\nODD: ");
		oddEven.get(false).forEach(integer -> System.out.print(integer + " "));
	}
}

/*
 *   EVEN:
 *   2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48
 * 
 *   ODD:
 *   3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
 */