/**
 * LeetCode
 * Problem_06.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to check if array contains duplicate using for loop
	 * 
	 * @param nums
	 * @return {@link boolean}
	 */
	public static boolean containsDuplicate_ForLoop(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Method to check if array contains duplicate using sort
	 * 
	 * @param nums
	 * @return {@link boolean}
	 */
	public static boolean containsDuplicate_Sort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == nums[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Method to check if array contains duplicate using hash map
	 * 
	 * @param nums
	 * @return {@link boolean}
	 */
	public static boolean containsDuplicate_HashMap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (countMap.containsKey(nums[i])) {
				countMap.put(nums[i], countMap.get(nums[i]) + 1);
			} else {
				countMap.put(nums[i], 1);
			}
		}
		for (int val : countMap.values()) {
			if (val > 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Method to check if array contains duplicate using set
	 * 
	 * @param nums
	 * @return {@link boolean}
	 */
	public static boolean containsDuplicate_HashSet(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		final Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}

}
