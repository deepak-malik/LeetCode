/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.Math;

/**
 * <br> Problem Statement :
 * 
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * 
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to add all digits of a given number
	 * 
	 * This problem is based on congruence formula, which says
	 * 		10^k % 9 = 1
	 * 		a*10^k % 9 = a % 9
	 * 
	 * Example : Say a number is 234
	 * X = 2 * 100 + 3 * 10 + 4
	 * 2 * 100 % 9 = 2 % 9
	 * 3 * 10 % 9 = 3 % 9
	 * and 4 left
	 * 
	 * Add all of them, so
	 * X = 2 % 9 + 3 % 9 + 4 => (2 + 3 + 4) % 9
	 * Since 9 % 9 == 0, return 9
	 * 
	 * @param num
	 * @return {@link int}
	 */
	public static int addDigits(int num) {
		if (num == 0) {
			return 0;
		}
		if (num % 9 == 0) {
			return 9;
		} else {
			return num % 9;
		}
	}

	/**
	 * Method to add all digits of a given number
	 * 
	 * @param num
	 * @return {@link int}
	 */
	public static int addDigits_Congruence_Formula(int num) {
		return 1 + (num - 1) % 9;
	}
}
