/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.Trees;

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
	public static <T> int maxDepth(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.getLeft());
		int rightDepth = maxDepth(root.getRight());
		return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1 : Math.max(leftDepth, rightDepth) + 1;
	}

}
