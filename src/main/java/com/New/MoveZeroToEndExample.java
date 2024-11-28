package com.New;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndExample {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(1, 0, 0, 2, 0, 4, 9, 0, 5));
        moveZerosToEnd(numList);
        System.out.println(numList);
    }

    private static void moveZerosToEnd(List<Integer> numList) {
        int writeIndex = 0;

        for (int readIndex = 0; readIndex < numList.size(); readIndex++) {
            int num = numList.get(readIndex);
            if (num != 0) {
                numList.set(writeIndex, num);
                writeIndex++;
            }
        }

        while (writeIndex < numList.size()) {
            numList.set(writeIndex, 0);
            writeIndex++;
        }
    }
}

/*
 * output:
 * [1, 2, 4, 9, 5, 0, 0, 0, 0]
 */