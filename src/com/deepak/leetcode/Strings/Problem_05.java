/**
 * LeetCode
 * Problem_05.java
 */
package com.deepak.leetcode.Strings;

import java.util.Arrays;
import java.util.List;

/**
 * <br> Problem Statement :
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * 
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to reverse vowels in a string
	 * 
	 * @param s
	 * @return {@link String}
	 */
	public static String reverseVowels(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		char[] charArray = s.toCharArray();
		int start = 0, end = charArray.length - 1;
		while (start < end) {
			while (start < end && !vowels.contains(charArray[start])) {
				start++;
			}
			while (start < end && !vowels.contains(charArray[end])) {
				end--;
			}
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

}
