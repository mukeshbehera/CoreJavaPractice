package com.arrays;

public class CopyArr2 {

	public static void main(String args[]) {
		int[] copyfrom = {10,20,30,40,50,60,70,80,90,100};
		int[] copyto = java.util.Arrays.copyOfRange(copyfrom, 1, 7);
		
		for(int cc:copyto) {
			System.out.print(cc+" ");
		}
	}
}

/*
 *  Output:  20 30 40 50 60 70
 */