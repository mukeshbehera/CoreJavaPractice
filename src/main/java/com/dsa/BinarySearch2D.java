package com.dsa;

public class BinarySearch2D {
    public static int[] binarySearch2D(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0, end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return new int[]{mid / cols, mid % cols}; // Return row and column indices
            } else if (midElement < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;

        int[] position = binarySearch2D(matrix, target);
        if (position[0] != -1) {
            System.out.println("Target found at row " + position[0] + ", column " + position[1]);
        } else {
            System.out.println("Target not found.");
        }
    }
}
