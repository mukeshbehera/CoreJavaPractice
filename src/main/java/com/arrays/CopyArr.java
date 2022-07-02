package com.arrays;

public class CopyArr {

	public static void main(String args[]) {
		int[] copyfrom = {10,20,30,40,50,60,70,80,90,100};
		int[] copyto = new int[7];
		
		//System.arraycopy(copyfrom, 0, copyto, 0, copyfrom.length);
		System.arraycopy(copyfrom, 1, copyto, 0,7); //copyfrom index 1 to copyto till index 7 
		
		for(int cc:copyto) {
			System.out.println(cc);
		}
	}
}
