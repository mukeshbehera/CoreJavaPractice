package com.otherprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingScanner {
	
	private static Scanner sc;


	//method for sorting
	public static int[] SortMethod(int[] ar) {
		int[] val=ar;
		int temp=0;
		for(int i=0; i<val.length; i++) {
			for(int j=i+1; j<val.length; j++) {
				if(val[i] > val[j]) {
					temp = val[i];
					val[i] = val[j];
					val[j] = temp;
				}
			}
		}
		return val;
	}
	
	
	//main method
	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements you want in your array: ");
		int no_of_elements = sc.nextInt();
		
		//creating array as per the input from user
		int[] arr = new int[no_of_elements];
		
		//getting inputs for the created array
		System.out.println("Enter the array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//printing the created array
		System.out.println("You've entered : "+Arrays.toString(arr).replace("[", "").replace("]", ""));
		
		//printing the sorted array
		System.out.println("Sorted array is : "+ Arrays.toString(SortMethod(arr)).replace("[", "").replace("]", ""));
		
		//close scanner
		sc.close();
	}
}
