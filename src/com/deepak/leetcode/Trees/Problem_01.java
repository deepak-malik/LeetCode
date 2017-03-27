/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Trees;

import java.util.LinkedList;
import java.util.Queue;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path 
 * from the root node down to the nearest leaf node.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find a minimum depth of a tree
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int minDepth_Recursive(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = minDepth_Recursive(root.getLeft());
		int rightDepth = minDepth_Recursive(root.getRight());
		return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;
	}

	/**
	 * Method to find a minimum depth of a tree using iterative approach
	 * This is BFS
	 * 
	 * @param root
	 * @return {@link int}
	 */
	public static <T> int minDepth_Iterative(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode<T> endOfLevel = root;
		int depth = 1;
		while (!queue.isEmpty()) {
			TreeNode<T> node = queue.remove();
			if (node.getLeft() == null && node.getRight() == null) {
				return depth;
			}
			if (node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.offer(node.getRight());
			}
			if (node == endOfLevel) {
				endOfLevel = node.getRight() == null ? node.getLeft() : node.getRight();
				depth++;
			}
		}
		return depth;
	}

}
