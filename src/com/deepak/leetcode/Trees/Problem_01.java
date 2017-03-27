/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Trees;

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
	public static <T> int minDepth(TreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = minDepth(root.getLeft());
		int rightDepth = minDepth(root.getRight());
		return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;
	}

}
