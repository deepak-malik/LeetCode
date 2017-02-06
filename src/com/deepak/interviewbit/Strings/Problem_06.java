/**
 * InterviewBit
 * Problem_06.java
 */
package com.deepak.interviewbit.Strings;

/**
 * Implement strStr().
 * strstr - locate a substring (needle) in a string (hay stack). 
 * Try not to use standard library string functions for this question.
 * 
 * Returns the index of the first occurrence of needle in hay stack, or -1 if needle is not part of hay stack.
 * 
 * NOTE: Good clarification questions:
 * What should be the return value if the needle is empty?
 * What if both hay stack and needle are empty?
 * For the purpose of this problem, assume that the return value should be -1 in both cases. 
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to locate a substring i.e a needle in the hay stack
	 * 
	 * @param haystack
	 * @param needle
	 * @return {@link int}
	 */
	public static int locateSubString(String haystack, String needle) {
		/* Let index be - 1, return that if hay stack or needle is null */
		int index = -1;
		if (haystack == null || haystack.isEmpty() || needle == null || needle.isEmpty()) {
			return index;
		}
		/* Traverse through entire hay stack */
		for (int i = 0; i < haystack.length(); i++) {
			/* Update index with i */
			index = i;
			int j = 0;
			/* Have 2 pointers, pointing each to hay stack and needle 
			 * and compare the characters */
			while (i < haystack.length() && j < needle.length()
					&& haystack.charAt(i) == needle.charAt(j)) {
				/* If found, keep going */
				i++;
				j++;
			}
			/* Since j is associated with needle, so after traversing 
			 * through entire hay stack or needle, see if j is equal to
			 * length of needle. If yes, we found then index */
			if (j == needle.length()) {
				return index;
			}
			/* If not found, update the value of i */
			i = index;
		}
		return -1;
	}

}
