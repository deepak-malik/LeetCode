/**
 * InterviewBit
 * Problem_03.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 
 * 1, 11, 21, 1211, 111221, ...
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 * Note: The sequence of integers will be represented as a string.
 * 
 * Example: if n = 2, the sequence is 11.
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to count and say the number
	 * 
	 * Time Complexity : O(n) => Where n is number of characters in n 
	 * Space Complexity : O(n) => Worst case, all numbers from n will be pushed to builder
	 * 
	 * @param n
	 * @return {@link String}
	 */
	public static String countAndSay(int n) {
		/* If n is less then 0, return null */
		if (n <= 0) {
			return null;
		}
		/* Have result initialized as 1 and start from 1 until we reach n */
		String result = "1";
		int i = 1;
		while (i < n) {
			/* Create a new string builder every time
			 * we deal with new number */
			StringBuilder builder = new StringBuilder();
			int count = 1;
			/* Go in only if we have more then one characters in result */
			for (int j = 1; j < result.length(); j++) {
				/* if characters are same at current and previous position,
				 * increase the counter else append to builder and reset */
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					builder.append(count);
					builder.append(result.charAt(j - 1));
					count = 1;
				}
			}
			/* For last set of characters, append and return */
			builder.append(count);
			builder.append(result.charAt(result.length() - 1));
			result = builder.toString();
			i++;
		}
		return result;
	}

}
