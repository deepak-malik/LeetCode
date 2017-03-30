/**
 * LeetCode
 * Problem_08.java
 */
package com.deepak.leetcode.Trees;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree 
 * in which the depth of the two subtrees of every node never differ by more than 1.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to check if binary tree is balanced
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static <T> boolean isBalanced(TreeNode<T> root) {
		if (root == null) {
			return true;
		}
		int heightOfLeftTree = findHeight(root.getLeft());
		int heightOfRightTree = findHeight(root.getRight());
		return Math.abs(heightOfLeftTree - heightOfRightTree) < 2 && 
				isBalanced(root.getLeft()) && isBalanced(root.getRight());
	}

	/**
	 * Method to find the height of binary tree
	 * 
	 * @param node
	 * @return {@link int}
	 */
	private static <T> int findHeight(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		int left = findHeight(node.getLeft());
		int right = findHeight(node.getRight());
		return left > right ? left + 1 : right + 1;
	}

}
