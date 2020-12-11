import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(2);

        List<Integer> shiftedArray = moveElementToEnd(integers, 2);
        for (Integer num : shiftedArray) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int left = 0, right = array.size() - 1;
        while (left < right) {
            if (array.get(left) != toMove) {
                left++;
            } else if (array.get(right) == toMove) {
                right--;
            } else {
                int temp = array.get(right);
                array.set(right, array.get(left));
                array.set(left, temp);
            }
        }
        return array;
    }
}
