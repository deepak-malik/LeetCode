/**
 * InterviewBit
 * Problem_08.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Implement atoi to convert a string to an integer.
 * 
 * Example : Input : "9 2704"
 * Output : 9
 * 
 * Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.
 * 
 * Questions: 
 * Q1. Does string contain whitespace characters before the number? A. Yes 
 * Q2. Can the string have garbage characters after the number? A. Yes. Ignore it. 
 * Q3. If no numeric character is found before encountering garbage characters, what should I do? A. Return 0. 
 * Q4. What if the integer overflows? A. Return INT_MAX if the number is positive, INT_MIN otherwise. 
 * Warning : DO NOT USE LIBRARY FUNCTION FOR ATOI.
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to implement atoi 
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int atoi(String input) {
		/* If input is null or empty, no need of further processing */
		if (input == null || input.isEmpty()) {
			return 0;
		}
		/* Trim the input to avoid whitespace issues */
		input = input.trim();
		/* Check the input after trimming */
		if (input.isEmpty()) {
			return 0;
		}
		/* Start from the first character and check the sign.
		 * Increment the counter as well */
		int i = 0;
		boolean positiveFlag = true;
		if (input.charAt(0) == '-') {
			positiveFlag = false;
			i++;
		} else if (input.charAt(0) == '+') {
			i++;
		}
		/* Find the result */
		int result = 0;
		while (input.length() > i && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
			result = result * 10 + (Character.getNumericValue(input.charAt(i)));
			i++;
		}
		/* Adjust the sign */
		if (!positiveFlag) {
			result = -result;
		}
		/* Handle min and max values */
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return result;
	}

}
