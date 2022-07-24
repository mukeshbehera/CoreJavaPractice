package com.arrays;

import java.util.Scanner;

public class AddElementToArray2 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println("Enter the number of elements you want to add: ");
		Scanner scanner = new Scanner(System.in);
		int numOfElementsToBeAdded = scanner.nextInt();
		
		int[] newArr = new int[arr.length+numOfElementsToBeAdded];
		
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		for(int i=arr.length; i<newArr.length; i++) {
			System.out.print("Enter the "+(i+1)+" Elements: ");
			newArr[i] = scanner.nextInt();
		}
		
		//printing
		for (int i : newArr) {
			System.out.print(i+", ");
		}
		
		scanner.close();
	}
}

/*
 *  Output: 
 *  
 *  Enter the number of elements you want to add: 
 *  3
 *  Enter the 9 Elements: 66
 *  Enter the 10 Elements: 77
 *  Enter the 11 Elements: 88
 *  1, 2, 3, 4, 5, 6, 7, 8, 66, 77, 88, 
 */
