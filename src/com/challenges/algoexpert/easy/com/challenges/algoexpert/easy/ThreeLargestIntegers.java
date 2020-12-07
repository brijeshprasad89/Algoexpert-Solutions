package com.challenges.algoexpert.easy;

/**
 *
 */
public class ThreeLargestIntegers {
    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 9, 10, 12};
        int[] threeLargestNumbers = findThreeLargestNumbers(array);
        System.out.println(threeLargestNumbers[0]);
        System.out.println(threeLargestNumbers[1]);
        System.out.println(threeLargestNumbers[2]);
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] maxThree = new int[]{-999999, -999999, -999999};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxThree[2]) {
                int temp2 = maxThree[1];
                maxThree[1] = maxThree[2];
                maxThree[2] = array[i];
                maxThree[0] = temp2;
            } else if (array[i] >= maxThree[1]) {
                int temp2 = maxThree[1];
                maxThree[1] = array[i];
                maxThree[0] = temp2;
            } else if (array[i] >= maxThree[0]) {
                maxThree[0] = array[i];
            }
        }
        return maxThree;
    }
}
