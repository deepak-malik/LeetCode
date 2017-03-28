/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * 
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 
 * Note:
 * You may assume the string contains only lower case alphabets.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to check if two strings are anagrams of each other using sorting
	 * 
	 * @param s
	 * @param t
	 * @return {@link boolean}
	 */
	public static boolean isAnagram_Sort(String s, String t) {
		if ((s == null && t == null) || (s.length() == 0 && t.length() == 0)) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return Arrays.equals(sArray, tArray);
	}

	/**
	 * Method to check if two strings are anagram of each other using hash map
	 * 
	 * @param s
	 * @param t
	 * @return {@link boolean}
	 */
	public static boolean isAnagram_HashMap(String s, String t) {
		if ((s == null && t == null) || (s.length() == 0 && t.length() == 0)) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (countMap.containsKey(s.charAt(i))) {
				countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);
			} else {
				countMap.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (countMap.containsKey(t.charAt(i))) {
				countMap.put(t.charAt(i), countMap.get(t.charAt(i)) - 1);
			}
		}
		for (int val : countMap.values()) {
			if (val != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to check if two strings are anagram of each other using char array
	 * 
	 * @param s
	 * @param t
	 * @return {@link boolean}
	 */
	public static boolean isAnagram_CharArray(String s, String t) {
		if ((s == null && t == null) || (s.length() == 0 && t.length() == 0)) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		int[] array = new int[26];
		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			if (--array[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

}
