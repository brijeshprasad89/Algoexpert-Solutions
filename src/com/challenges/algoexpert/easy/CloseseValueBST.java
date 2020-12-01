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
        BST node1 = new BST(1);
        BST node2 = new BST(2);
        BST node3 = new BST(5);
        BST node4 = new BST(5);
        BST tree = new BST(10);
        BST node6 = new BST(14);
        BST node7 = new BST(13);
        BST node8 = new BST(22);
        BST node9 = new BST(15);

        node1.left = null;
        node1.right = null;
        node2.left = node1;
        node2.right = null;
        node3.left = node2;
        node3.right = node4;
        tree.left = node3;
        node6.left = null;
        node6.right = null;
        node7.left = null;
        node7.right = node6;
        node8.left = null;
        node8.right = null;
        node9.right = node8;
        node9.left = node7;
        tree.right = node9;
        System.out.print(findClosestValueInBst(tree, 12));
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
        return findClosestValueInBst(tree, target, tree.value);
    }

    private static int findClosestValueInBst(BST tree, int target, int closest) {

        BST currentNode = tree;
        while (null != currentNode) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }

        return closest;
    }

}


