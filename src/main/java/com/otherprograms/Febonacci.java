package com.otherprograms;

import java.util.Scanner;

class Febonacci { 
	
	//Febonacci: next number is the sum of previous two numbers. Example:  8 4 12 16 28 44 72 116 188 304
	
	public static void main(String[] args) { 
		System.out.println("enter the no required for febonacci");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter first no of febonacci");
		int x = sc.nextInt();
		System.out.println("enter second no of febonacci");
		int y = sc.nextInt();
		int[] feb = new int[a];
		feb[0]=x;
		feb[1]=y;
		for (int i=2;i<a;i++){
			feb[i]=feb[i-1]+feb[i-2];
			}
		//print the data

		for (int feb1 : feb) { 
			System.out.print(" "+feb1);
			}
		}
}

