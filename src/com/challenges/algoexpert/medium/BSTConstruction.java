/**
 * Insert, Search and Delete operation in Binary Search Tree
 */
public class BSTConstruction {

    public static void main(String[] args) {
        BST bst = new BST(14);
        bst.insert(4);
        bst.insert(5);

        System.out.println(bst);
        System.out.println(bst.contains(174));
        System.out.println(bst.contains(14));

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            BST node = new BST(value);
            if (value < this.value) {
                if (left == null) {
                    left = node;
                } else {
                    left.insert(value);
                }
            } else {
                if (value >= this.value) {
                    if (right == null) {
                        right = node;
                    } else {
                        right.insert(value);
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) {
                    return false;
                }
                return left.contains(value);
            } else if (value > this.value) {
                if (right == null) {
                    return false;
                }
                return right.contains(value);
            } else {
                return true;
            }

        }


        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            return this;
        }
    }
}
