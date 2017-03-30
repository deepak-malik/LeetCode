/**
 * LeetCode
 * Problem_10.java
 */
package com.deepak.leetcode.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * 
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_10 {

	/**
	 * Method to remove duplicates from sorted array
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int i = 1;
		for (int n : nums) {
			if (n > nums[i - 1]) {
				nums[i++] = n;
			}
		}
		return i;
	}

}
