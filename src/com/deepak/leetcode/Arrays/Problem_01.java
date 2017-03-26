/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1]
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to return indices of two numbers which add up to a specific target
	 * 
	 * Time Complexity : O(n) => Where n is number of elements in input array
	 * Space Complexity : O(n) => In the worst case, all elements will be added to map
	 * 
	 * @param nums
	 * @param target
	 * @return {@link int[]}
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		if (nums == null || nums.length < 2) {
			return result;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			/* Handle Duplicates */
			if (map.containsKey(target - nums[i])) {
				continue;
			}
			map.put(nums[i], i);
		}
		return result;
	}

}
