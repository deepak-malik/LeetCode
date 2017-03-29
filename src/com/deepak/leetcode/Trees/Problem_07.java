/**
 * LeetCode
 * Problem_07.java
 */
package com.deepak.leetcode.Trees;

import java.util.LinkedList;
import java.util.Queue;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *  	 1
 *  	/ \
 *     2   2
 *    / \ / \
 *   3  4 4  3
 *   
 *   But the following [1,2,2,null,3,null,3] is not:
 *   	1
 *     / \
 *    2   2
 *    \   \
 *    3    3
 *    
 *    Note: Bonus points if you could solve it both recursively and iteratively.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {
	
	/**
	 * Method to check if tree is symmetric using recursive approach
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static <T> boolean isSymmetric_Recursive(TreeNode<T> root) {
		return root == null || isSymmetric(root.getLeft(), root.getRight());
	}
	
	/**
	 * Method to check if tree is symmetric when two nodes are given
	 * 
	 * @param left
	 * @param right
	 * @return {@link boolean}
	 */
	private static <T> boolean isSymmetric(TreeNode<T> left, TreeNode<T> right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.getVal() != right.getVal()) {
			return false;
		}
		return isSymmetric(left.getLeft(), right.getRight()) && isSymmetric(left.getRight(), right.getLeft());
	}
	
	/**
	 * Method to check if tree is symmetric using iterative approach
	 * 
	 * @param root
	 * @return {@link boolean}
	 */
	public static <T> boolean isSymmetric_Iterative(TreeNode<T> root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.offer(root.getLeft());
		queue.offer(root.getRight());
		while (queue.size() > 1) {
			TreeNode<T> left = queue.poll();
			TreeNode<T> right = queue.poll();
			if (left == null && right == null) {
				continue;
			}
			if (left == null || right == null) {
			    return false;
			}
			if (left.getVal() != right.getVal()) {
				return false;
			}
			queue.offer(left.getLeft());
			queue.offer(right.getRight());
			queue.offer(left.getRight());
			queue.offer(right.getLeft());
		}
		return true;
	}

}
