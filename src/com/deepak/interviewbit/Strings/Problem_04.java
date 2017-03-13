/**
 * InterviewBit
 * Problem_04.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * 
 * Example: Given s = "Hello World", return 5 as length("World") = 5.
 * Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to find the length of last word
	 * 
	 * Time Complexity : O(n) => Where n is number of characters
	 * Space Complexity : O(l) => Extra space used for StringBuilder, it can contain l characters
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int lengthOfLastWord(String input) {
		/* If input is empty, return 0 */
		if (input == null || input.isEmpty()) {
			return 0;
		}
		/* Create a string builder and convert the input to char array.
		 * Ensure you trim the input to remove trailing white spaces */
		StringBuilder builder = new StringBuilder();
		char[] charArray = input.trim().toCharArray();
		/* Check each character, if it is not space then append to builder
		 * else initialize the builder again. This is to ensure we always
		 * have last word in builder after space */
		for (char c : charArray) {
			if (c != ' ') {
				builder.append(c);
			} else {
				builder = new StringBuilder();
			}
		}
		/* If length of builder is greater then 0, return it */
		if (builder.length() > 0) {
			return builder.length();
		}
		return 0;
	}

	/**
	 * Method to find the length of last word
	 * 
	 * Time Complexity : O(l) => Where l is the length of last word
	 * Space Complexity : O(1) => No extra space used, x is using String, but thats constant space
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int lengthOfLastWord_Better(final String input) {
		/* If input is empty, return 0 */
		if (input == null || input.length() == 0) {
			return 0;
		}
		/* Trim the input, so that we don't have to deal with white spaces at the end */
		String x = input.trim();
		int size = 0;
		int high = x.length() - 1;
		/* Start from last word and break when we see first space */
		while (high >= 0) {
			if (x.charAt(high) == ' ') {
				break;
			} else {
				size++;
				high--;
			}
		}
		return size;
	}

}
