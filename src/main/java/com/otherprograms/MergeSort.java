package com.otherprograms;

import java.util.Arrays;

public class MergeSort {

	static int[] value1 ={1, 2, 4, 10, 6, 19};
	static int[] value2 ={16, 21, 28, 14, 20};
	
	public static void main(String[] args) {

		// approach 1
		approach1();

		// approach 2
		approach2();

		approach3();
	}

	private static void approach3() {
		Arrays.sort(value1);
		Arrays.sort(value2);

		int n = value1.length;
		int m = value2.length;

		int[] merged = new int[n + m];

		int i = 0, j = 0, k = 0;

		// Merge elements from both arrays
		while (i < n && j < m) {
			if (value1[i] < value2[j]) {
				merged[k++] = value1[i++];
			} else {
				merged[k++] = value2[j++];
			}
		}

		// Copy remaining elements from value1
		while (i < n) {
			merged[k++] = value1[i++];
		}

		// Copy remaining elements from value2
		while (j < m) {
			merged[k++] = value2[j++];
		}

		System.out.println("Merged Array: " + Arrays.toString(merged));
	}


	private static void approach2() {
		int[] merged = new int[value1.length + value2.length];

		System.arraycopy(value1, 0, merged, 0, value1.length);
		System.arraycopy(value2, 0, merged, value1.length, value2.length);

		Arrays.sort(merged);

		System.out.println("Merged Value is : "+Arrays.toString(merged).replace("[", "").replace("]", ""));
	}


	private static void approach1() {
		int[] merged = new int[value1.length + value2.length];

		int count = 0;
		for(int i=0; i<value1.length; i++) {
			merged[i] = value1[i];
			count++;
		}

        for (int i : value2) {
            merged[count++] = i;
        }

		Arrays.sort(merged);

		System.out.println("Merged Value is : "+Arrays.toString(merged).replace("[", "").replace("]", ""));
	}
}

