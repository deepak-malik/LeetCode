/**
 * LeetCode
 * Problem_04.java
 */
package com.deepak.leetcode.Trees;

import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and 
 * the nodes have the same value.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if two trees are same using recursive approach
	 * 
	 * @param p
	 * @param q
	 * @return {@link boolean}
	 */
	public static <T> boolean isSameTree_Recursive(TreeNode<T> p, TreeNode<T> q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return p.getVal() == q.getVal() && isSameTree_Recursive(p.getLeft(), q.getLeft())
				&& isSameTree_Recursive(p.getRight(), q.getRight());
	}

	/**
	 * Method to check if two trees are same using iterative approach
	 * 
	 * @param p
	 * @param q
	 * @return {@link boolean}
	 */
	public static <T> boolean isSameTree_Iterative(TreeNode<T> p, TreeNode<T> q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		Stack<TreeNode<T>> stackP = new Stack<>();
		Stack<TreeNode<T>> stackQ = new Stack<>();
		stackP.push(p);
		stackQ.push(q);
		while (!stackP.isEmpty() && !stackQ.isEmpty()) {
			TreeNode<T> nodeP = stackP.pop();
			TreeNode<T> nodeQ = stackQ.pop();
			if (nodeP.getVal() != nodeQ.getVal()) {
				return false;
			}
			if (nodeP.getLeft() != null && nodeQ.getLeft() != null) {
				stackP.push(nodeP.getLeft());
				stackQ.push(nodeQ.getLeft());
			} else if (nodeP.getLeft() == null && nodeQ.getLeft() == null) {
				/* do nothing */
			} else {
				return false;
			}
			if (nodeP.getRight() != null && nodeQ.getRight() != null) {
				stackP.push(nodeP.getRight());
				stackQ.push(nodeQ.getRight());
			} else if (nodeP.getRight() == null && nodeQ.getRight() == null) {
				/* do nothing */
			} else {
				return false;
			}
		}
		if (!stackP.isEmpty() || !stackQ.isEmpty()) {
			return false;
		}
		return true;
	}

}
