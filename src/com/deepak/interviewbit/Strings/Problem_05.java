/**
 * InterviewBit
 * Problem_05.java
 */
package com.deepak.interviewbit.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * <br> Problem Statement :
 * 
 * Given an input string, reverse the string word by word.
 * 
 * Example:
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to reverse the string
	 * 
	 * Time Complexity : O(n) => Where n is number of words in the input
	 * Space Complexity : O(n) => Extra space for StringBuilder and it may contains n words
	 * Leetcode Runtime : 13 ms
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String reverseString(String input) {
		/* If input is null or empty, return null */
		if (input == null || input.isEmpty()) {
			return null;
		}
		/* Create a list of string which will have words
		 * Separated by space */
		List<String> words = new ArrayList<>();
		/* Convert to array of String by splitting on whitespace */
		String[] strArray = input.trim().split("\\s");
		for (String string : strArray) {
			/* If valid word add it to the beginning.
			 * This way we have already reversed the string */
			if (!string.isEmpty()) {
				words.add(0, string);
			}
		}
		/* Join with white spaces and return */
		return String.join(" ", words);
	}

	/**
	 * Method to reverse the string 
	 * 
	 * Time Complexity : O(n) => Where n is number of words in the input
	 * Space Complexity : O(n) => Extra space for StringBuilder and it may contains n words
	 * Leetcode runtime : 9 ms
	 * 
	 * @param input
	 * @return {@link String}
	 */
	public static String reverseString_Better(String input) {
		/* If input is null or empty, return null */
		if (input == null || input.length() == 0) {
			return null;
		}
		/* Create a StringBuilder for result, trim the input and split based on space */
		StringBuilder builder = new StringBuilder();
		input = input.trim();
		String[] strArray = input.split("\\s");
		/* Start from last word, trim it, and if it is valid, append to builder */
		for (int i = strArray.length - 1; i >= 0; i--) {
			String str = strArray[i].trim();
			if (str != null && str.length() != 0) {
				builder.append(str + " ");	            
			}
		}
		return builder.toString().trim();
	}

}
