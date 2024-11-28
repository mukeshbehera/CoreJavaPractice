package com.New;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "DataScienceAndEngineering";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First unique character: " + charArray[i]);
                return;
            }
        }
        System.out.println("No unique characters found.");
    }
}