package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class TreatDistributions {
    public static void main(String[] args) {
        int animals = 3; // Number of animals and treats
        int treats = 4;
        List<List<Integer>> combinations = generateCombinations(treats, animals);

        System.out.println("Possible distributions of treats:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    // Generate combinations of treats for animals
    private static List<List<Integer>> generateCombinations(int treats, int animals) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        generate(treats, animals, 1, combination, result);
        return result;
    }

    // Recursive helper method
    private static void generate(int treats, int animals, int min, List<Integer> combination, List<List<Integer>> result) {
        if (combination.size() == animals) {
            if (treats == 0) {
                result.add(new ArrayList<>(combination));
            }
            return;
        }

        for (int i = min; i <= treats; i++) {
            combination.add(i);
            generate(treats - i, animals, i, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
