/**
 * InterviewBit
 * Problem_02.java
 */
package com.deepak.leetcode.Strings;

/**
 * <br> Problem Statement :
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
 * 
 * Example: Given the array as:
 * ["abcdefgh", "aefghijk", "abcefgh"]
 * The answer would be “a”.
 *  
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find the longest common prefix
	 * Note : This method uses a inbuilt function - substring
	 * 
	 * Time Complexity : indexOf takes O(m*n) where m is length of string and n is pattern
	 * Space Complexity : O(1)
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String longestCommonPrefix(String[] input) {
		/* Check if array is null or length is 0 */
		if (input == null || input.length == 0) {
			return "";
		}
		String prefix = input[0];
		for (int i = 1; i < input.length; i++) {
			/* Index of returns 0 if substring exists */
			while (input[i].indexOf(prefix) != 0) {
				/* If substring does not exists, start removing characters from end */
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

}
