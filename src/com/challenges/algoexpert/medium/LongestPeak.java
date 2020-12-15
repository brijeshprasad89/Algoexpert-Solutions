import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in an array of integers and returns the length of
 * the longest peak in the array.
 * </p>
 * <p>
 * A peak is defined as adjacent integers in the array that are <b>strictly</b>
 * increasing until they reach a tip (the highest value in the peak), at which
 * point they become <b>strictly</b> decreasing. At least three integers are required to
 * form a peak.
 * </p>
 * <p>
 * For example, the integers 1, 4, 10, 2 form a peak, but the
 * integers 4, 0, 10 don't and neither do the integers
 * 1, 2, 2, 0. Similarly, the integers 1, 2, 3 don't
 * form a peak because there aren't any strictly decreasing integers after the
 * 3.
 * </p>
 * <h3>Sample Input</h3>
 * array = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]
 *
 * <h3>Sample Output</h3>
 * 6 // 0, 10, 6, 5, -1, -3
 */


public class LongestPeak {
    public static void main(String[] args) {
        System.out.print(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }

    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
            if (!isPeak) {
                i += 1;
                continue;
            }
            int leftSide = i - 2;
            while (leftSide >= 0 && array[leftSide] < array[leftSide + 1]) {
                leftSide--;
            }

            int rightSide = i + 2;

            while (rightSide < array.length && array[rightSide] < array[rightSide - 1]) {
                rightSide++;
            }
            int peakLength = rightSide - leftSide - 1;
            if (peakLength > longestPeakLength) longestPeakLength = peakLength;

            i = rightSide;
        }
        return longestPeakLength;
    }
}
