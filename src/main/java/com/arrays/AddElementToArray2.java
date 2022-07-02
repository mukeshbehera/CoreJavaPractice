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
