/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.HashTable;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check if two strings are anagram using sorting
	 */
	@Test
	public void testAnagram_Sort() {
		Assert.assertTrue(Problem_01.isAnagram_Sort("", ""));
		Assert.assertTrue(Problem_01.isAnagram_Sort(null, null));
		Assert.assertTrue(Problem_01.isAnagram_Sort("a", "a"));
		Assert.assertTrue(Problem_01.isAnagram_Sort("jdgsgkk", "kgkgsdj"));
		Assert.assertTrue(Problem_01.isAnagram_Sort("cinema", "iceman"));
		Assert.assertTrue(Problem_01.isAnagram_Sort("radar", "radar"));
		Assert.assertFalse(Problem_01.isAnagram_Sort("cinema", "icemans"));
	}

	/**
	 * Test case to check if two strings are anagram using hash map
	 */
	@Test
	public void testAnagram_HashMap() {
		Assert.assertTrue(Problem_01.isAnagram_HashMap("", ""));
		Assert.assertTrue(Problem_01.isAnagram_HashMap(null, null));
		Assert.assertTrue(Problem_01.isAnagram_HashMap("a", "a"));
		Assert.assertTrue(Problem_01.isAnagram_HashMap("jdgsgkk", "kgkgsdj"));
		Assert.assertTrue(Problem_01.isAnagram_HashMap("cinema", "iceman"));
		Assert.assertTrue(Problem_01.isAnagram_HashMap("radar", "radar"));
		Assert.assertFalse(Problem_01.isAnagram_HashMap("cinema", "icemans"));
	}

	/**
	 * Test case to check if two strings are anagram using char array
	 */
	@Test
	public void testAnagram_CharArray() {
		Assert.assertTrue(Problem_01.isAnagram_CharArray("", ""));
		Assert.assertTrue(Problem_01.isAnagram_CharArray(null, null));
		Assert.assertTrue(Problem_01.isAnagram_CharArray("a", "a"));
		Assert.assertTrue(Problem_01.isAnagram_CharArray("jdgsgkk", "kgkgsdj"));
		Assert.assertTrue(Problem_01.isAnagram_CharArray("cinema", "iceman"));
		Assert.assertTrue(Problem_01.isAnagram_CharArray("radar", "radar"));
		Assert.assertFalse(Problem_01.isAnagram_CharArray("cinema", "icemans"));
	}

}
