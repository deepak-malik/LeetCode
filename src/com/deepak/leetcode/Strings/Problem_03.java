/**
 * LeetCode
 * Problem_03.java
 */
package com.deepak.leetcode.Strings;

/**
 * <br> Problem Statement :
 * 
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * 
 * Examples:
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lower case letters.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_03 {

	/**
	 * Method to find first unique character in a string
	 * 
	 * @param s
	 * @return {@link int}
	 */
	public static int firstUniqChar(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		int[] freqCount = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freqCount[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freqCount[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
