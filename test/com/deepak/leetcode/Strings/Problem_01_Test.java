/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to reverse a string using string builder
	 */
	@Test
	public void testReverseString_StringBuilder() {
		Assert.assertEquals(Problem_01.reverseString_StringBuilder("hello"), "olleh");
		Assert.assertEquals(Problem_01.reverseString_StringBuilder("Deepak Malik"), "kilaM kapeeD");
	}

	/**
	 * Test case to reverse a string using two pointers
	 */
	@Test
	public void testReverseString_TwoPointers() {
		Assert.assertEquals(Problem_01.reverseString_TwoPointers("hello"), "olleh");
		Assert.assertEquals(Problem_01.reverseString_TwoPointers("Deepak Malik"), "kilaM kapeeD");
	}

}
