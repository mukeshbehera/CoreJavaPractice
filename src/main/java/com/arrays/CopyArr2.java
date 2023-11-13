package com.arrays;

import java.util.Arrays;

public class CopyArr2 {

	public static void main(String args[]) {
		int[] copyfrom = {10,20,30,40,50,60,70,80,90,100};
		int[] copyto = java.util.Arrays.copyOfRange(copyfrom, 1, 7);

		for(int cc:copyto) {
			System.out.print(cc+" ");
		}
		System.out.println();

		//second method
		int[] copyArray = Arrays.copyOf(copyfrom, copyfrom.length);

		System.out.println(Arrays.toString(copyArray));
	}
}

/*
 *  Output:  20 30 40 50 60 70
 */