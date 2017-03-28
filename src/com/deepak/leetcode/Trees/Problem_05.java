/**
 * LeetCode
 * Problem_05.java
 */
package com.deepak.leetcode.Trees;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to convert sorted array to BST
	 * 
	 * @param nums
	 * @return {@link TreeNode<Integer>}
	 */
	public static TreeNode<Integer> sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return createBST(nums, 0, nums.length - 1);
	}

	/**
	 * Method to create a BST
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @return {@link TreeNode<Integer>}
	 */
	private static TreeNode<Integer> createBST(int[] nums, int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode<Integer> root = new TreeNode<Integer>(nums[mid]);
		root.setLeft(createBST(nums, start, mid - 1));
		root.setRight(createBST(nums, mid + 1, end));
		return root;
	}

}
