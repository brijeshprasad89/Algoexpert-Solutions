/**
 * Write a function that takes in an array of integers and returns a boolean
 * representing whether the array is monotonic.
 * <p>
 * An array is said to be monotonic if its elements, from left to right, are
 * entirely non-increasing or entirely non-decreasing.
 * <p>
 * Non-increasing elements aren't necessarily exclusively decreasing; they simply
 * don't increase. Similarly, non-decreasing elements aren't necessarily
 * exclusively increasing; they simply don't decrease.
 * <p>Note that empty arrays and arrays of one element are monotonic.</p>
 * Input = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 * Output = true
 */

public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.print(isMonotonic(arr));
    }

    public static boolean isMonotonic(int[] array) {
        if (array.length == 0) return true;
        int increasingCount = 1, decreasingCount = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                increasingCount++;
            }
            if (array[i] >= array[i + 1]) {
                decreasingCount++;
            }
        }

        if (increasingCount == array.length || decreasingCount == array.length) return true;
        return false;
    }
}
