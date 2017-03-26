/**
 * InterviewBit
 * Problem_09.java
 */
package com.deepak.leetcode.Strings;

import java.util.regex.Pattern;

/**
 * <br> Problem Statement :
 * 
 * Validate if a given string is numeric?
 * 
 * Examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to check if String is a valid number
	 * 
	 * Time Complexity : O(n) => Where n is number of characters in input
	 * Space Complexity : O(1) => No extra space used 
	 * 
	 * @param str
	 * @return {@link boolean}
	 */
	public static boolean isStringValidNumber(String str) {
		/* If string is null or length is zero, no need to process further */
		if (str == null || str.length() == 0) {
			return false;
		}
		/* Have flags for ., e, number and numberAfterE 
		 * numberAfterE to be kept as true */
		boolean pointSeen = false;
		boolean eSeen = false;
		boolean numberSeen = false;
		boolean numberAfterE = true;
		/* Check for each character in the string */
		for (int i = 0; i < str.length(); i++) {
			/* If it's a valid number, update numberSeen and numberAfterE flag.
			 * We are updating numberAfterE flag as true, because it may have been set
			 * to false earlier. */
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numberSeen = true;
				numberAfterE = true;
			} else if (str.charAt(i) == '.') {
				/* If we encounter ., ensure we have not seen a . or e before,
				 * because as per problem statement, there can't be two .'s
				 * or there can't be a . after e */
				if (eSeen || pointSeen) {
					return false;
				}
				pointSeen = true;
			} else if (str.charAt(i) == 'e') {
				/* If you encounter e, ensure this is not second time
				 * and e is not the first character in string */
				if (eSeen || !numberSeen) {
					return false;
				}
				eSeen = true;
				numberAfterE = false; /* Update number after e */
			} else if (str.charAt(i) == '-' || str.charAt(i) == '+') {
				/* If we encounter a sign, return false if this is not first character.
				 * Also, we can see a + or - after we have seen e */
				if (i != 0 && str.charAt(i - 1) != 'e') {
					return false;
				}
			} else {
				/* Else not a valid number */
				return false;
			}
		}
		/* We should have seen at least one number and 
		 * numberAfterE should always be true */
		return numberSeen && numberAfterE;
	}

	/**
	 * Method to check if string is a valid number using regular expression
	 * 
	 * Explanation of Regular Expression :
	 * \\s* => String start
	 * [\\-\\+]? => First character could be anything, + or -
	 * ([0-9]*\\.?) => Character could be anything between 0 to 9
	 * (e[\\-\\+]?[0-9]+) => Once e is seen, there could be a + or - after that, followed by a number 0-9
	 * ?\\s*" => String end
	 * 
	 * @param str
	 * @return {@link boolean}
	 */
	public static boolean isStringValidNumber_Regex(String str) {
		/* If string is null or length is zero, no need to process further */
		if (str == null || str.length() == 0) {
			return false;
		}
		String regex = "\\s*[\\-\\+]?([0-9]*\\.?)?[0-9]+(e[\\-\\+]?[0-9]+)?\\s*";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(str).matches();
	}

}
