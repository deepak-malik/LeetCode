/**
 * LeetCode
 * Problem_03.java
 */
package com.deepak.leetcode.Trees;

import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Find the sum of all left leaves in a given binary tree.
 * 
 * Example:
 * 			 3
 * 			/ \
 * 		       9  20
 * 			  /  \
 * 			 15   7
 * 
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to find sum of left leaves using iterative approach
	 * 
	 * @param root
	 * @return {@link int} 
	 */
	public static int sumOfLeftLeaves_Iterative(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		Stack<TreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode<Integer> node = stack.pop();
			if (node.getLeft() != null) {
				if (node.getLeft().getLeft() == null && node.getLeft().getRight() == null) {
					sum += node.getLeft().getVal();
				} else {
					stack.push(node.getLeft());
				}
			}
			if (node.getRight() != null) {
				if (node.getRight().getLeft() != null || node.getRight().getRight() != null) {
					stack.push(node.getRight());
				}
			}
		}
		return sum;
	}

	/**
	 * Method to get sum of left leaves using recursive approach
	 * 
	 * @param root
	 * @return {@link int} 
	 */
	public static int sumOfLeftLeaves_Recursive(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		sum += getLeftLeafValue(root);
		sum += sumOfLeftLeaves_Recursive(root.getLeft());
		sum += sumOfLeftLeaves_Recursive(root.getRight());
		return sum;
	}

	/**
	 * Method to get left leaf value
	 * 
	 * @param node
	 * @return {@link int}
	 */
	private static int getLeftLeafValue(TreeNode<Integer> node) {
		if (node != null && node.getLeft() != null && node.getLeft().getLeft() == null && node.getLeft().getRight() == null) {
			return node.getLeft().getVal();
		}
		return 0;
	}

}
