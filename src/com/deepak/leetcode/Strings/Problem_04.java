/**
 * LeetCode
 * Problem_04.java
 */
package com.deepak.leetcode.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. 
 * If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
 * then reverse the first k characters and left the other as original.
 * 
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * 
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to reverse a string for each k occurrences
	 * 
	 * 0            k           2k          3k
	 * |-----------|-----------|-----------|---
	 * +--reverse--+           +--reverse--+
	 * 
	 * @param s
	 * @param k
	 * @return {@link String}
	 */
	public static String reverseStr(String s, int k) {
		if (s == null || s.length() == 0) {
			return null;
		}
		char[] arr = s.toCharArray();
		for (int left = 0; left < arr.length; left += 2*k) {
			for (int i = left, j = Math.min(left + k - 1, arr.length - 1); i < j; i++, j--) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return new String(arr);
	}

}
