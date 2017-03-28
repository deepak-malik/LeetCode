/**
 * LeetCode
 * Problem_04.java
 */
package com.deepak.leetcode.Math;

/**
 * <br> Problem Statement :
 * 
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 
 * (where it will stay), or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 * 
 * Example: 19 is a happy number
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to check if a number is happy
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		do {
			slow = digitSquareSum(slow);
			fast = digitSquareSum(digitSquareSum(fast));
			if (fast == 1) {
				return true;
			}
		} while (slow != fast);
		return false;
	}

	/**
	 * Method to do a square a each digit and add them up
	 * 
	 * @param n
	 * @return {@link int}
	 */
	private static int digitSquareSum(int n) {
		int sum = 0;
		int temp;
		while (n != 0) {
			temp = n % 10;
			sum += temp * temp;
			n /= 10;
		}
		return sum;
	}

}
