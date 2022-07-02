package com.arrays;

import java.util.Scanner;

public class TakingDynamicInputArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter "+i+" Value: ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Entered Values Are: ");
		for(int a:arr) {
			System.out.print(a+", ");
		}
		
		scanner.close();
	}
}
