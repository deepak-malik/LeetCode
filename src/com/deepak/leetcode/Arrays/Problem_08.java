/**
 * LeetCode
 * Problem_08.java
 */
package com.deepak.leetcode.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {
	
	/**
	 * Method to remove elements from array
	 * 
	 * @param nums
	 * @param val
	 * @return {@link int}
	 */
	public static int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int newLength = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[newLength] = nums[i];
				newLength++;
			}
		}
		return newLength;
	}

}
