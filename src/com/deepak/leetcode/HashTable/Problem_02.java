/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * <br> Problem Statement :
 * 
 * Given a string which consists of lower case or upper case letters, find the length of the longest palindrome that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note: Assume the length of given string will not exceed 1,010.
 * 
 * Example:
 * Input: "abccccdd"
 * Output: 7
 * 
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to find longest palindrome in a string
	 * Idea here is to count number of pairs, if we have extra characters
	 * we can place one in the middle
	 * 
	 * @param s
	 * @return {@link int}
	 */
	public static int longestPalindrome_HashSet(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				count++;
			} else {
				set.add(s.charAt(i));
			}
		}
		if (!set.isEmpty()) {
			return count * 2 + 1;
		}
		return count * 2;
	}

	/**
	 * Method to find the longest palindrome using array
	 * 
	 * @param s
	 * @return {@link int}
	 */
	public static int longestPalindrome_Array(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int[] lowercase = new int[26];
		int[] uppercase = new int[26];
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 97) {
				lowercase[c - 'a']++;
			} else {
				uppercase[c - 'A']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			result += (lowercase[i]/2) * 2;
			result += (uppercase[i]/2) * 2;
		}
		return result == s.length() ? result : result + 1;
	}

}
