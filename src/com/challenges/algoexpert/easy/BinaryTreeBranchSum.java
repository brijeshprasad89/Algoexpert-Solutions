package com.challenges.algoexpert.easy;

import java.util.*;

/**
 * <p>
 * Write a function that takes in a Binary Tree and returns a list of its branch
 * sums ordered from leftmost branch sum to rightmost branch sum.
 * </p>
 * <p>
 * A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
 * branch is a path of nodes in a tree that starts at the root node and ends at
 * any leaf node.
 * </p>
 * <p>
 * Each BinaryTree node has an integer value, a
 * left child node, and a right child node. Children
 * nodes can either be BinaryTree nodes themselves or
 * None / null.
 * </p>
 * tree =     1
 * /     \
 * 2       3
 * /   \    /  \
 * 4     5  6    7
 * /   \  /
 * 8    9 10
 * <p>
 * [15, 16, 18, 10, 11]
 * // 15 == 1 + 2 + 4 + 8
 * // 16 == 1 + 2 + 4 + 9
 * // 18 == 1 + 2 + 5 + 10
 * // 10 == 1 + 3 + 6
 * // 11 == 1 + 3 + 7
 */
public class BinaryTreeBranchSum {

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

        System.out.print(branchSums(node1));
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        Integer currentSum = 0;
        List<Integer> sumList = new ArrayList<>();
        return branchSums(root, currentSum, sumList);
    }

    public static List<Integer> branchSums(BinaryTree root, Integer currentSum, List<Integer> sumList) {
        if (null != root.left) {
            Integer newSum = currentSum + root.value;
            BinaryTree node = root.left;
            branchSums(node, newSum, sumList);
        }
        if (null != root.right) {
            Integer newSum = currentSum + root.value;
            BinaryTree node = root.right;
            branchSums(node, newSum, sumList);
        }
        if (null == root.left && null == root.right) {
            Integer newSum = currentSum + root.value;
            sumList.add(newSum);
        }

        return sumList;
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }


}
