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
 * return [0, 1].
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find the indexes of two numbers whose sum is equal to target
	 * This approach works when input is sorted
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 * 
	 * @param nums
	 * @param target
	 * @return {@link int[]}
	 */
	public static int[] twoSum_Sorted(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int lowIndex = 0;
		int highIndex = nums.length - 1;
		while (highIndex > lowIndex) {
			long sum = nums[lowIndex] + nums[highIndex];
			if (sum == target) {
				return new int[]{lowIndex, highIndex};
			} else if (sum < target) {
				lowIndex++;
			} else {
				highIndex--;
			}
		}
		return null;
	}

	/**
	 * Method to find the indexes of two numbers whose sum is equal to target
	 * This approach works when input is sorted or unsorted
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 * 
	 * @param nums
	 * @param target
	 * @return {@link int[]}
	 */
	public static int[] twoSum_UnSorted(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
			}
			/* Handle duplicates */
			if (map.containsKey(nums[i])) {
				continue;
			}
			map.put(nums[i], i);
		}
		return result;
	}

}
