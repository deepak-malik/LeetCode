/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Recursion;

import java.util.List;

import com.deepak.leetcode.Library.NestedInteger;

/**
 * <br> Problem Statement :
 * 
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]], return 10. (four 1's at depth 2, one 2 at depth 1)
 * 
 * 		2
 * 	 /     \
 * [1,1]  [1,1]
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find depth sum of a nested list
	 * 
	 * @param nestedList
	 * @return {@link int}
	 */
	public static int depthSum(List<NestedInteger> nestedList) {
		return helper(nestedList, 1);
	}

	/**
	 * Helper method to find sum
	 * 
	 * @param list
	 * @param depth
	 * @return {@link int}
	 */
	private static int helper(List<NestedInteger> list, int depth) {
		if (list == null || list.size() == 0) {
			return 0;
		}
		int sum = 0;
		for (NestedInteger nestedInt : list) {
			if (nestedInt.isInteger()) {
				sum += nestedInt.getInteger() * depth;
			} else {
				sum += helper(list, depth + 1);
			}
		}
		return sum;
	}

}
