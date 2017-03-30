/**
 * LeetCode
 * Problem_09.java
 */
package com.deepak.leetcode.Trees;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * For example:
 * Given the below binary tree and sum = 22,
 *            5
 *           / \
 *          4   8
 *         /   / \
 *        11  13  4
 *       /  \      \
 *      7    2      1
 *      
 *	return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to check if there exists a path sum from root to leaf 
	 * 
	 * @param root
	 * @param sum
	 * @return {@link boolean} 
	 */
	public static boolean hasPathSum(TreeNode<Integer> root, int sum) {
		if (root == null) {
			return false;
		}
		if (root.getLeft() == null && root.getRight() == null && sum - root.getVal() == 0) {
			return true;
		}
		return hasPathSum(root.getLeft(), sum - root.getVal()) || 
				hasPathSum(root.getRight(), sum - root.getVal());
	}

}
