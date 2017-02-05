/**
 * InterviewBit
 * Problem_02.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
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
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String longestCommonPrefix(String[] input) {
		/* Check if array is null or length is 0 */
		if (input == null || input.length == 0) {
			return null;
		}
		/* Check if we have at least two strings */
		if (input.length < 2) {
			throw new IllegalArgumentException("Atleast two strings are needed !!");
		}
		/* Loop through each of the element */
		StringBuilder builder = new StringBuilder();
		builder.append(input[0]);
		for (String string : input) {
			/* Now, we have first word as common prefix and we will compare 
			 * each word with it character by character */
			for (int i = 0; i < builder.length(); i++) {
				/* If any character doesn't match, 
				 * we replace all further characters by blank 
				 * in the builder, so that we are left with
				 * only the one which matched. Once all the words are
				 * checked, we will be left with only common characters */
				if (string.charAt(i) != builder.charAt(i)) {
					builder.replace(i, builder.length(), "");
				}
			}
		}
		/* Return the final string from builder */
		return builder.toString();
	}

}
