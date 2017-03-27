/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.BitManipulation;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find the single number in array
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int result = 0;
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}

}
