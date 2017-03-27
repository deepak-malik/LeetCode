/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * <br> Problem Statement :
 * 
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * Note: You may assume that both strings contain only lower case letters.
 * 
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to check if a ransom note can be constructed from a magazine
	 * 
	 * @param ransomNote
	 * @param magazine
	 * @return {@link boolean}
	 */
	public static boolean canConstruct_HashMap(String ransomNote, String magazine) {
		if (magazine == null && ransomNote == null) {
			return true;
		}
		if (magazine.length() == 0 && ransomNote.length() == 0) {
			return true;
		}
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		Map<Character, Integer> ransomMap = new HashMap<>();
		/* Create a histogram of ransom note */
		for (int i = 0; i < ransomNote.length(); i++) {
			if (ransomMap.containsKey(ransomNote.charAt(i))) {
				ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
			} else {
				ransomMap.put(ransomNote.charAt(i), 1);
			}
		}
		/* Check the occurrence in magazine */
		for (int i = 0; i < magazine.length(); i++) {
			if (ransomMap.containsKey(magazine.charAt(i))) {
				if (ransomMap.get(magazine.charAt(i)) != 0) {
					ransomMap.put(magazine.charAt(i), ransomMap.get(magazine.charAt(i)) - 1);
				}
			}
		}
		/* All values should be 0, else return false */
		for (int val : ransomMap.values()) {
			if (val != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to check if a ransom note can be constructed from a magazine
	 * 
	 * @param ransomNote
	 * @param magazine
	 * @return {@link boolean}
	 */
	public static boolean canConstruct_Optimized(String ransomNote, String magazine) {
		int[] arr = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

}
