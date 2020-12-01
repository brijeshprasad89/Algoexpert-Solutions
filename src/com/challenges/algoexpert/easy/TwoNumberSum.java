package com.challenges.algoexpert.easy;

import java.util.HashMap;

/**
 * Write a function that takes in a non-empty array of distinct integers and an
 * integer representing a target sum. If any two numbers in the input array sum
 * up to the target sum, the function should return them in an array, in any
 * order. If no two numbers sum up to the target sum, the function should return
 * an empty array.
 * Input :
 * array = [3, 5, -4, 8, 11, 1, -1, 6]
 * targetSum = 10;
 * <p>
 * Output
 * [-1,11]
 */

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] obj = twoNumbersSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.print(obj[0]);
        System.out.print(obj[1]);
    }

    private static int[] twoNumbersSum(int[] array, int targetSum) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            Integer diff = targetSum - array[i];
            if ((h.containsKey(diff) && h.get(diff) == array[i]) || (h.containsKey(array[i]) && h.get(array[i]) == diff)) {
                return new int[]{diff, array[i]};
            }
            h.put(Integer.valueOf(array[i]), diff);
        }
        return new int[0];
    }
}
