/**
 * InterviewBit
 * Problem_01.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases. 
 * Example: "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to check of a string is palindrome
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int isPalindrome(String input) {
		/* Check for null or empty string */
		if (input == null || input.isEmpty()) {
			return 1;
		}
		/* Convert to charArray and check if each digit is a character 
		 * If yes, append to the builder */
		StringBuilder builder = new StringBuilder();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (Character.isLetterOrDigit(c)) {
				builder.append(c);
			}
		}
		/* Since, we need to ignore cases, converting to upper case */
		String updatedString = builder.toString().toUpperCase();
		/* We need to start comparing each character from both sides of string,
		 * And we will loop through half length only because if length is odd,
		 * we will have equal number of even characters on each side and we don't
		 * need to check on single odd for palindrome. If length is even, we 
		 * are good too because we will compare each character in that case. */
		int i = 0, j = updatedString.length() - 1;
		while (i < updatedString.length() / 2) {
			if (updatedString.charAt(i) != updatedString.charAt(j)) {
				return 0;
			}
			/* Keep moving towards middle from both sides */
			i++; j--;
		}
		return 1;
	}

}
