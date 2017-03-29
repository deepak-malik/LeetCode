/**
 * LeetCode
 * Problem_06.java
 */
package com.deepak.leetcode.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to find mode of a tree
	 * 
	 * @param root
	 * @return {@link int[]}
	 */
	public static int[] findMode(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		Map<Integer, Integer> countMap = new HashMap<>();
		countMap = populateCountMap(root);
		int[] result = createModeArray(countMap);
		return result;
	}

	/**
	 * Method to populate count map of occurrences
	 * 
	 * @param root
	 * @return {@link Map<Integer, Integer>}
	 */
	private static Map<Integer, Integer> populateCountMap(TreeNode<Integer> root) {
		Map<Integer, Integer> result = new HashMap<>();
		Stack<TreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode<Integer> node = stack.pop();
			if (result.containsKey(node.getVal())) {
				result.put(node.getVal(), result.get(node.getVal()) + 1);
			} else {
				result.put(node.getVal(), 1);
			}
			if (node.getLeft() != null) {
				stack.push(node.getLeft());
			}
			if (node.getRight() != null) {
				stack.push(node.getRight());
			}
		}
		return result;
	}

	/**
	 * Method to create mode array
	 * 
	 * @param countMap
	 * @return {@link int[]}
	 */
	private static int[] createModeArray(Map<Integer, Integer> countMap) {
		int max = 0;
		for (int val : countMap.values()) {
			max = val > max ? val : max; 
		}
		List<Integer> modeElements = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == max) {
				modeElements.add(entry.getKey());
			}
		}
		int[] result = new int[modeElements.size()];
		int index = 0;
		for (int maxItem : modeElements) {
			result[index] = maxItem;
			index++;
		}
		return result;
	}

}
