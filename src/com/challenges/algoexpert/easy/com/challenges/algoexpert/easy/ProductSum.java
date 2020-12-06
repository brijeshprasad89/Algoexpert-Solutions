package com.challenges.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Write a function that takes in a "special" array and returns its product sum.
 * </p>
 * <p>
 * A "special" array is a non-empty array that contains either integers or other
 * "special" arrays. The product sum of a "special" array is the sum of its
 * elements, where "special" arrays inside it are summed themselves and then
 * multiplied by their level of depth.
 * </p>
 * <p>
 * The depth of a "special" array is how far nested it is. For instance, the
 * depth of [] is 1; the depth of the inner array in
 * [[]] is 2; the depth of the innermost array in
 * [[[]]] is 3.
 * </p>
 * <p>
 * Therefore, the product sum of [x, y] is x + y; the
 * product sum of [x, [y, z]] is x + 2 * (y + z); the
 * product sum of [x, [y, [z]]] is x + 2 * (y + 3z).
 * <p>
 * Input : [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
 * Output :  calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)
 */

public class ProductSum {

    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();

        List<Object> a1 = new ArrayList<>();
        a1.add(-13);
        a1.add(8);
        List<Object> a2 = new ArrayList<>();
        a2.add(6);
        a2.add(a1);
        a2.add(4);
        List<Object> a3 = new ArrayList<>();
        a3.add(7);
        a3.add(-1);
        array.add(5);
        array.add(2);
        array.add(a3);
        array.add(3);
        array.add(a2);

        System.out.print(productSum(array, 1));
    }

    public static int productSum(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object arr : array) {
            if (arr instanceof ArrayList) {
                sum += productSum((List) arr, multiplier + 1);
            } else {
                sum = sum + (int) arr;
            }
        }
        return sum * multiplier;
    }

}
