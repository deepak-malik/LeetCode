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

}
