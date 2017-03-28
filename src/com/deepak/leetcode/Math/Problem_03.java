/**
 * LeetCode
 * Problem_03.java
 */
package com.deepak.leetcode.Math;

/**
 * <br> Problem Statement :
 * 
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * 
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * 
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to add two strings
	 * Note - This does not handle null or empty strings.
	 * 
	 * @param num1
	 * @param num2
	 * @return {@link String}
	 */
	public static String addStrings(String num1, String num2) {
		StringBuilder builder = new StringBuilder();
		int carry = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
			int x = i < 0 ? 0 : num1.charAt(i) - '0';
			int y = j < 0 ? 0 : num2.charAt(j) - '0';
			builder.append((x + y + carry) % 10);
			carry = (x + y + carry) /10;
		}
		return builder.reverse().toString();
	}

}
