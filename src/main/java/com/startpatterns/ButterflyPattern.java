package com.startpatterns;

public class ButterflyPattern {
    public static void printButterfly(int n) {
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this value to adjust the size of the butterfly
        printButterfly(n);
    }
}
