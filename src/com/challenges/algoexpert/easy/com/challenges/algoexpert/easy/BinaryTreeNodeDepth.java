package com.challenges.algoexpert.easy;

/**
 * <p>
 * The distance between a node in a Binary Tree and the tree's root is called the
 * node's depth.
 * </p>
 * <p>
 * Write a function that takes in a Binary Tree and returns the sum of its nodes'
 * depths.
 * </p>
 * <p>
 * Each BinaryTree node has an integer value, a
 * left child node, and a right child node. Children
 * nodes can either be BinaryTree nodes themselves or
 * None / null.
 * </p>
 * <p>
 * input =        1
 * ----------- /     \
 * ---------- 2       3
 * ---------/   \   /   \
 * --------4     5 6     7
 * ------/   \
 * -----8     9
 * <p>
 * 16
 * // The depth of the node with value 2 is 1.
 * // The depth of the node with value 3 is 1.
 * // The depth of the node with value 4 is 2.
 * // The depth of the node with value 5 is 2.
 * // Etc..
 * // Summing all of these depths yields 16.
 */
public class BinaryTreeNodeDepth {

    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        BinaryTree node8 = new BinaryTree(8);
        BinaryTree node9 = new BinaryTree(9);
        BinaryTree node10 = new BinaryTree(10);

        node8.left = null;
        node8.right = null;

        node9.left = null;
        node9.right = null;

        node10.left = null;
        node10.right = null;

        node6.left = null;
        node6.right = null;

        node7.left = null;
        node7.right = null;

        node4.left = node8;
        node4.right = node9;

        node5.left = node10;
        node5.right = null;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node1.left = node2;
        node1.right = node3;

        System.out.print(nodeDepths(node1));
    }

    public static int nodeDepths(BinaryTree root) {
        int depth = 0;
        return nodeDepths(root, depth);
    }

    private static int nodeDepths(BinaryTree root, int depth) {
        if (null == root) return 0;
        return depth + nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
