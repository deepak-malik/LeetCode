/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.Arrays;


/**
 * <br> Problem Statement :
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note: You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {
	
	/**
	 * Method to move zeroes to the end of array
	 * 
	 * @param nums
	 * @return {@link int[]}
	 */
	public static int[] moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int j = 0; /* This will be first non zero element */
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		return nums;
	}

}
