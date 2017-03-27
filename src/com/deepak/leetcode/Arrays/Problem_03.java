/**
 * LeetCode
 * Problem_03.java
 */
package com.deepak.leetcode.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to find indices in array whose sum is equal to target
	 * Here, input array is sorted in ascending order
	 * 
	 * @param numbers
	 * @param target
	 * @return {@link int[]}
	 */
	public static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		int low = 0;
		int high = numbers.length - 1;
		while (high > low) {
			long sum = numbers[low] + numbers[high];
			if (sum == target) {
				return new int[]{low + 1, high + 1};
			} else if (sum < target) {
				low++;
			} else {
				high--;
			}
		}
		return null;
	}

}
