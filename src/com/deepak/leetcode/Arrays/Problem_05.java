/**
 * LeetCode
 * Problem_05.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to find majority element using sorting
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int majorityElement_Sort(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	/**
	 * Method to find majority element using hash map
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int majorityElement_HashMap(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : nums) {
			if (!freqMap.containsKey(num)) {
				freqMap.put(num, 1);
			} else {
				freqMap.put(num, freqMap.get(num) + 1);
				if (freqMap.get(num) > nums.length/2) {
					return num;
				}
			}
		}
		return 0;
	}

	/**
	 * Method to find majority element using moore's voting algorithm
	 * 
	 * @param nums
	 * @return {@link int}
	 */
	public static int majorityElement_MooreVotingAlgorithm(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int count = 0, majElement = 0;
		for (int num : nums) {
			if (count == 0) {
				majElement = num;
			}
			if (num == majElement) {
				count++;
			} else {
				count--;
			}
		}
		return majElement;
	}

}
