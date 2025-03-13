package com.otherprograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        // Creating BigDecimal with very high precision
        example1();

        System.out.println();
        example2();
    }

    private static void example2() {
        // Original BigDecimal
        BigDecimal value = new BigDecimal("123.456789");

        // Setting precision to 2 decimal places
        BigDecimal roundedValue = value.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Rounded to 2 decimal places: " + roundedValue);

        // Setting precision to 4 decimal places
        BigDecimal extendedValue = value.setScale(4, RoundingMode.HALF_UP);
        System.out.println("Rounded to 4 decimal places: " + extendedValue);
    }

    private static void example1() {
        BigDecimal preciseValue = new BigDecimal("123456789012345678901234567890.123456789012345678901234567890");
        System.out.println("Arbitrary-Precision BigDecimal: " + preciseValue);

        // Performing operations
        BigDecimal anotherValue = new BigDecimal("0.000000000000000000000000000001");
        BigDecimal result = preciseValue.add(anotherValue);
        System.out.println("After Addition: " + result);
    }
}
