package com.stringmanipulation;

public class RecursiveReverseString {

    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = reverse(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);


        String[] strArr = original.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder.append(reverse(strArr[i]));
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // Recursively reverse the substring from the second character till the end
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
