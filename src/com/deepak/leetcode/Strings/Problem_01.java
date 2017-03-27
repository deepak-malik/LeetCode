/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Strings;

/**
 * <br> Problem Statement :
 * 
 * Write a function that takes a string as input and returns the string reversed.
 * 
 * Example:
 * Given s = "hello", return "olleh".
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to reverse a String using StringBuilder
	 * 
	 * Time Complexity : O(n) => Where n is number of characters in the string
	 * Space Complexity : O(n) => Space needed to transform string to char array and using string builder
	 * 
	 * @param s
	 * @return {@link String}
	 */
	public static String reverseString_StringBuilder(String s) {
		if (s == null || s.length() == 0) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			builder.append(charArray[i]);
		}
		return builder.toString();
	}

	/**
	 * Method to reverse a String using two pointers
	 * 
	 * Time Complexity : O(n) => Where n is number of characters in the string
	 * Space Complexity : O(n) => Space needed to transform string to char array 
	 * 
	 * @param s
	 * @return {@link String}
	 */
	public static String reverseString_TwoPointers(String s) {
		if (s == null || s.length() == 0) {
			return null;
		}
		char[] charArray = s.toCharArray();
		int low = 0, high = charArray.length - 1;
		while (high > low) {
			swap(charArray, low, high);
			low++;
			high--;
		}
		return String.valueOf(charArray);
	}

	/**
	 * Method to swap values in char array when low and high indexes are given 
	 * 
	 * @param charArray
	 * @param low
	 * @param high
	 */
	private static void swap(char[] charArray, int low, int high) {
		char temp = charArray[low];
		charArray[low] = charArray[high];
		charArray[high] = temp;
	}

}
