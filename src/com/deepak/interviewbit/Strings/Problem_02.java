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
		/* Check if we have atleast two strings */
		if (input.length < 2) {
			throw new IllegalArgumentException("Atleast two strings are needed !!");
		}
		/* Loop through each of the element */
		StringBuilder builder = new StringBuilder();
		for (String string : input) {
			/* if builder's length is 0, that means it is the first entry. Add it. */
			if (builder.length() == 0) {
				builder.append(string);
			}
			/* Now, we have first word in builder and we will compare 
			 * each word with it character by character */
			for (int i = 0; i < builder.length(); i++) {
				/* If any character doesn't match, 
				 * we replace all further characters by blank 
				 * in the builder, so that we are left with
				 * only the one which matched. Once all the words are
				 * checked, we will be left with only common characters */
				if (string.charAt(i) != builder.toString().charAt(i)) {
					builder.replace(i, builder.length(), "");
				}
			}
			/* If it is still equals to first string, 
			 * then we didn't find any common prefix.
			 * Resetting the builder */
			if (builder.toString().equalsIgnoreCase(input[0]) &&
					!input[0].equalsIgnoreCase(input[1])) {
				builder = new StringBuilder();
			}
		}
		/* Return the final string from builder */
		return builder.toString();
	}

}
