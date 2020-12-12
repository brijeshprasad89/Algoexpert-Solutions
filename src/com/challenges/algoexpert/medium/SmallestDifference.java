import java.util.HashMap;
import java.util.List;

/**
 * Write a function that takes in two non-empty arrays of integers, finds the
 * pair of numbers (one from each array) whose absolute difference is closest to
 * zero, and returns an array containing these two numbers, with the number from
 * the first array in the first position.
 * <p>
 * Note that the absolute difference of two integers is the distance between
 * them on the real number line. For example, the absolute difference of -5 and 5
 * is 10, and the absolute difference of -5 and -4 is 1.
 * <p>
 * <p>
 * You can assume that there will only be one pair of numbers with the smallest
 * difference.
 * Input :  arrayOne = [-1, 5, 10, 20, 28, 3] arrayTwo = [26, 134, 135, 15, 17]
 * Output :[28, 26]
 */

//NOTE : better solution exists with single travers of array
public class SmallestDifference {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = new int[]{26, 134, 135, 15, 17};
        int[] ints = smallestDifference(arrayOne, arrayTwo);
        System.out.print(ints[0] + " " + ints[1]);
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int min = 9999999;
        int[] pair = new int[2];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int absDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (absDiff < min) {
                    min = absDiff;
                    pair[0] = arrayOne[i];
                    pair[1] = arrayTwo[j];
                }

            }
        }
        return pair;
    }
}
