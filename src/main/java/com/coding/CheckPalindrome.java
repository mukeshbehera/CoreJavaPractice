package com.coding;

public class CheckPalindrome {

    public static void main(String[] args) {

        String string = "Mukesh";
        int num = 202;

        String result = isPalindrome(string) ? " : is palindrome" : " : is not palindrome";
        System.out.println(string + result);
    }

    private static <T> boolean isPalindrome(T value) {
        String string = String.valueOf(value);
        return new StringBuilder(string).reverse()
                                        .toString()
                                        .equalsIgnoreCase(string);
    }
}
