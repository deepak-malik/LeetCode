/**
 * LeetCode
 * Problem_07.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * 
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * 
 * Note: Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to find first missing number
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int missingNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int length = nums.length;
		int expectedSum = (length * (length + 1))/2;
		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

	/**
	 * Method to find first missing number using binary search
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int missingNumer_BinarySearch(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		Arrays.sort(nums);
		int left = 0, right = nums.length;
		while (left < right) {
			int mid = (left + right)/2;
			if (nums[mid] > mid) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	/**
	 * Method to find first missing number using XOR
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int missingNumber_XOR(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int result = nums.length;
		for (int i = 0; i < nums.length; i++) {
			result ^= i;
			result ^= nums[i];
		}
		return result;
	}

}
