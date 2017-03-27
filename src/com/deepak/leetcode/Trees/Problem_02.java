/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.Trees;

import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find a maximum depth of a tree
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int maxDepth_Recursive(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth_Recursive(root.getLeft());
		int rightDepth = maxDepth_Recursive(root.getRight());
		return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1 : Math.max(leftDepth, rightDepth) + 1;
	}

	/**
	 * Method to find max depth of tree using iterative approach
	 * This is DFS
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int maxDepth_Iterative(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		Stack<TreeNode<T>> stack = new Stack<>();
		stack.push(root);
		int depth = 0;
		while (!stack.isEmpty()) {
			int size = stack.size();
			while (size-- > 0) {
				TreeNode<T> current = stack.pop();
				if (current.getLeft() != null) {
					stack.push(current.getLeft());
				}
				if (current.getRight() != null) {
					stack.push(current.getRight());
				}
			}
			depth++;
		}
		return depth;
	}

}
