/**
 * <p>
 * Write a function that takes in a non-empty array of integers and returns an
 * array of the same length, where each element in the output array is equal to
 * the product of every other number in the input array.
 * </p>
 * <p>
 * In other words, the value at output[i] is equal to the product of
 * every number in the input array other than input[i].
 * </p>
 * <p>Note that you're expected to solve this problem without using division.</p>
 * <h3>Sample Input</h3>
 * array = [5, 1, 4, 2]
 * </pre>
 * <h3>Sample Output</h3>
 * [8, 40, 10, 20]
 * 8 is equal to 1 x 4 x 2
 * 40 is equal to 5 x 4 x 2
 * 10 is equal to 5 x 1 x 2
 * 20 is equal to 5 x 1 x 4
 */
public class ArrayOfProducts {
    public static void main(String[] args) {
        int[] ints = arrayOfProducts(new int[]{5, 1, 4, 2});
        for (int n : ints) {
            System.out.print(n + " ");
        }
    }

    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int output[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int leftProductArray = 1;
            int rightProductArray = 1;
            int tempIndex = i;
            while (tempIndex >= 0) {
                if (tempIndex != i) {
                    leftProductArray = leftProductArray * array[tempIndex];
                }
                tempIndex--;
            }
            tempIndex = i;
            while (tempIndex < array.length) {
                if (tempIndex != i) {
                    rightProductArray = rightProductArray * array[tempIndex];
                }
                tempIndex++;
            }
            output[i] = leftProductArray * rightProductArray;
        }
        return output;
    }
}
