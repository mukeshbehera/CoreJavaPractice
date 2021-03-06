package com.otherprograms;


public class PrintAllOddEvenNumbers {

	public static void main(String[] args) {
		
		System.out.println("Even Numbers: ");
		for(int i=0; i<50; i++) {
			if (i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		

		System.out.println("\nOdd Numbers: ");
		for(int i=0; i<50; i++) {
			if (i%2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
}

/**
 *  Output:  Even Numbers: 
 *  		 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 
 *  		 Odd Numbers: 
 *  		 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 
 *
 */