/**
 * InterviewBit
 * Problem_04.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
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

}
