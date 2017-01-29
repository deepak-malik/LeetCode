/**
 * InterviewBit
 * Problem_05.java
 */
package com.deepak.interviewbit.BitManipulation;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 * 
 * Example :
 * Input : [1 2 2 3 1]
 * Output : 3
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Returns the lonely integer in the array
	 * 
	 * @param array - Array passed
	 * @return - {@link int} - Lonely Integer
	 */
	public static int findLonelyInteger(int[] array) {
		int result = 0;
		for (int value : array) {
			/* XOR of 2 same numbers gives zero, so keep doing
			 * XOR of 2 numbers starting from first position.
			 * If a number exists twice, result will be zero, 
			 * else we will be left with the number that appears once. */
			result ^= value;
		}
		return result;
	}

}
