/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check if a ransom note can be constructed from magazine
	 * These test cases check approach based on hash map
	 */
	@Test
	public void testCanConstruct_HashMap() {
		Assert.assertFalse(Problem_02.canConstruct_HashMap("a", "b"));
		Assert.assertFalse(Problem_02.canConstruct_HashMap("ab", "bbbb"));
		Assert.assertTrue(Problem_02.canConstruct_HashMap("abc", "bddacb"));
		Assert.assertTrue(Problem_02.canConstruct_HashMap("a", "aaaaaaaaaaaa"));
		Assert.assertTrue(Problem_02.canConstruct_HashMap("a", "a"));
	}

	/**
	 * Test case to check if a ransom note can be constructed from magazine
	 * These test cases check approach based on array count
	 */
	@Test
	public void testCanConstruct_Optimized() {
		Assert.assertFalse(Problem_02.canConstruct_Optimized("a", "b"));
		Assert.assertFalse(Problem_02.canConstruct_Optimized("ab", "bbbb"));
		Assert.assertTrue(Problem_02.canConstruct_Optimized("abc", "bddacb"));
		Assert.assertTrue(Problem_02.canConstruct_Optimized("a", "aaaaaaaaaaaa"));
		Assert.assertTrue(Problem_02.canConstruct_Optimized("a", "a"));
	}

}
