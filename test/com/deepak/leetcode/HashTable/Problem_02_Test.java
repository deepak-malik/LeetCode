/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.HashTable;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check longest palindrome using hash set
	 */
	@Test
	public void testLongestPalindrome_HashSet() {
		Assert.assertEquals(Problem_02.longestPalindrome_HashSet(""), 0);
		Assert.assertEquals(Problem_02.longestPalindrome_HashSet(null), 0);
		Assert.assertEquals(Problem_02.longestPalindrome_HashSet("abccccdd"), 7);
		Assert.assertEquals(Problem_02.longestPalindrome_HashSet("aabdfgssscccc"), 9);
	}

	/**
	 * Test case to check longest palindrome using array
	 */
	@Test
	public void testLongestPalindrome_Array() {
		Assert.assertEquals(Problem_02.longestPalindrome_Array(""), 0);
		Assert.assertEquals(Problem_02.longestPalindrome_Array(null), 0);
		Assert.assertEquals(Problem_02.longestPalindrome_Array("abccccdd"), 7);
		Assert.assertEquals(Problem_02.longestPalindrome_Array("aabdfgssscccc"), 9);
	}

}
