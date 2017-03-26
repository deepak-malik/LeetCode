/**
 * InterviewBit
 * Problem_01.java
 */
package com.deepak.leetcode.Strings;

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
	 * Method to check if a string is palindrome
	 * 
	 * Time Complexity : O(c) => Where c is number of characters in input 
	 * Space Complexity : O(n) => Using StringBuilder, and in worst case n characters could be pushed to it 
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int isPalindrome(String input) {
		/* Check for null or empty string */
		if (input == null || input.isEmpty()) {
			return 0;
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

	/**
	 * Method to check if a string is palindrome
	 * 
	 * Time Complexity : O(c) => Where c is number of characters in input 
	 * Space Complexity : O(n) => Converting to char array is linear time
	 * 
	 * @param input
	 * @return {@link int}
	 */
	public static int isPalindrome_Alternative(String input) {
		/* Check for null or empty string */
		if (input == null || input.length() == 0) {
			return 0;
		}
		/* Convert input to lower case and then character array */
		char[] array = input.toLowerCase().toCharArray();
		int i = 0;
		int j = array.length - 1;
		/* Start comparison from both start and end, 
		 * if any one of them is not a valid character, move to next,
		 * else compare it. If doesn't match, return 0 */
		while (i < j) {
			if (!Character.isLetterOrDigit(array[i])) {
				i++;
				continue;
			} else if (!Character.isLetterOrDigit(array[j])) {
				j--;
				continue;
			} else if (array[i] != array[j]) {
				return 0;
			}
			i++;
			j--;
		}
		return 1;
	}

}
