package com.challenges.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * Given two non-empty arrays of integers, write a function that determines
 * whether the second array is a subsequence of the first one.
 * <p>
 * A subsequence of an array is a set of numbers that aren't necessarily adjacent
 * in the array but that are in the same order as they appear in the array. For
 * instance, the numbers
 * Input --
 * array = [5, 1, 22, 25, 6, -1, 8, 10]
 * sequence  = [1, 6, -1, 10]
 * Output -- true
 * <p>
 */

public class ValidateSubsequence {
    public static void main(String[] args) {

        System.out.print(isValidSubsequence(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10)));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        List<Integer> positionList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (sequence.contains(array.get(i))) {
                positionList.add(i);
            }
        }

        if (positionList.stream().sorted().collect(Collectors.toList()).equals(positionList)) {
            return true;
        }
        return false;
    }
}
