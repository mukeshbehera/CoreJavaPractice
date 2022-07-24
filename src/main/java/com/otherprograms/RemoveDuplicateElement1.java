package com.otherprograms;

public class RemoveDuplicateElement1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,4,5,5,5,6,7,8,8,9,9};
		int current = arr[0];
		boolean found = false;
		
		
		for(int i=0; i<arr.length; i++) {
			if(current==arr[i] && !found) {
				found = true;
			}
			else if (current != arr[i]) {
				System.out.print(current+" ");
				current = arr[i];
				found = false;
			}
		}
		System.out.print(current+" ");
	}
}
