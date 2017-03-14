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
	public static int atoi(String str) {
		/* If string is null or length is zero, no need to process further */
		if (str == null || str.length() == 0) {
			return 0;
		}
		int sign = 1, base = 0, i = 0;
		/* Discard all leading white spaces */
		while (str.charAt(i) == ' ') {
			i++;
		}
		/* Check sign of the number */
		if (str.charAt(i) == '-' || str.charAt(i) == '+') {
			sign = str.charAt(i++) == '-' ? -1 : 1;
		}
		/* Check for Overflow */
		while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			base = 10 * base + (str.charAt(i++) - '0');
		}
		return base * sign;
	}

}
