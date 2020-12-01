package com.challenges.algoexpert.easy;

/**
 * <p>
 * Write a function that takes in a Binary Search Tree (BST) and a target integer
 * value and returns the closest value to that target value contained in the BST.
 * </p>
 * <p>You can assume that there will only be one closest value.</p>
 * <p>
 * Each <span>BST</span> node has an integer <span>value</span>, a
 * <span>left</span> child node, and a <span>right</span> child node. A node is
 * said to be a valid <span>BST</span> node if and only if it satisfies the BST
 * property: its <span>value</span> is strictly greater than the values of every
 * node to its left; its <span>value</span> is less than or equal to the values
 * of every node to its right; and its children nodes are either valid
 * <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
 * </p>
 * TREE :
 * 10
 * /     \
 * 5      15
 * /   \   /   \
 * 2     5 13   22
 * /           \
 * 1            14
 * target = 12
 * <p>
 * O/P : 13
 */

public class CloseseValueBST {

    public static void main(String[] args) {

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int min = -1;
        BST left = tree.left;
        BST right = tree.right;
        while (null != left && null != right) {

        }

        return -1;
    }

    private void traverseTree(BST node) {

    }

}


