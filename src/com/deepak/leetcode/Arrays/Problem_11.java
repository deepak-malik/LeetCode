/**
 * LeetCode
 * Problem_11.java
 */
package com.deepak.leetcode.Arrays;


/**
 * <br> Problem Statement :
 * 
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * 
 * </br>
 *  
 * @author Deepak
 */
public class Problem_11 {

	/**
	 * Method to rotate array by moving elements
	 * 
	 * @param nums
	 * @param k
	 * @return {@link int[]}
	 */
	public static int[] rotate_moveElements(int[] nums, int k) {
		if (nums == null || nums.length <= 1) {
			return null;
		}
		if (k == 0) return nums;
		k = k > nums.length ? k % nums.length : k;
		for (int i = 0; i < k; i++) {
			moveLastElementToFront(nums);
		}
		return nums;
	}

	/**
	 * Method to move last element to front
	 * 
	 * @param nums
	 */
	private static void moveLastElementToFront(int[] nums) {
		int last = nums[nums.length - 1];
		for (int i = nums.length - 1; i > 0; i--) {
			nums[i] = nums[i - 1];
		}
		nums[0] = last;
	}

	/**
	 * Method to rotate an array by reversing
	 * 
	 * @param nums
	 * @param k
	 * @return {@link int[]}
	 */
	public static int[] rotate_reverse(int[] nums, int k) {
		if (nums == null || nums.length <= 1) {
			return null;
		}
		k = k > nums.length ? k % nums.length : k;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
		return nums;
	}

	/**
	 * Method to reverse an array from start index till end index
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 */
	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
