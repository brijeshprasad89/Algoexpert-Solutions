package com.challenges.hard;

public class KnapSack01 {

    public static void main(String[] args) {
        int value[] = new int[]{60, 100, 120};
        int weight[] = new int[]{10, 20, 30};
        int W = 50;
        System.out.print(knapsack(value, weight, W, value.length));
    }

    private static int knapsack(int[] value, int weight[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        } else if (weight[n - 1] <= W) {
            return Math.max((value[n - 1] + knapsack(value, weight, W - weight[n - 1], n - 1)),
                    knapsack(value, weight, W, n - 1));
        } else if (weight[n - 1] > W) {
            return knapsack(value, weight, W, n - 1);
        }
        return -1;
    }
}
