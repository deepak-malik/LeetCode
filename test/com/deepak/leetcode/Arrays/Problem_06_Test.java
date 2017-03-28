/**
 * LeetCode
 * Problem_06_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/**
	 * Test case to check if an array contains duplicate using for loop
	 */
	@Test
	public void testDuplicates_ForLoop() {
		Assert.assertFalse(Problem_06.containsDuplicate_ForLoop(new int[]{}));
		Assert.assertFalse(Problem_06.containsDuplicate_ForLoop(null));
		Assert.assertFalse(Problem_06.containsDuplicate_ForLoop(new int[]{1}));
		Assert.assertFalse(Problem_06.containsDuplicate_ForLoop(new int[]{1, 2}));
		Assert.assertTrue(Problem_06.containsDuplicate_ForLoop(new int[]{1, 2, 3, 4, 1}));
		Assert.assertTrue(Problem_06.containsDuplicate_ForLoop(new int[]{1, 2, Integer.MAX_VALUE, 4, Integer.MAX_VALUE}));
	}

	/**
	 * Test case to check if an array contains duplicate using sort
	 */
	@Test
	public void testDuplicates_Sort() {
		Assert.assertFalse(Problem_06.containsDuplicate_Sort(new int[]{}));
		Assert.assertFalse(Problem_06.containsDuplicate_Sort(null));
		Assert.assertFalse(Problem_06.containsDuplicate_Sort(new int[]{1}));
		Assert.assertFalse(Problem_06.containsDuplicate_Sort(new int[]{1, 2}));
		Assert.assertTrue(Problem_06.containsDuplicate_Sort(new int[]{1, 2, 3, 4, 1}));
		Assert.assertTrue(Problem_06.containsDuplicate_Sort(new int[]{1, 2, Integer.MAX_VALUE, 4, Integer.MAX_VALUE}));
	}

	/**
	 * Test case to check if an array contains duplicate using hash map
	 */
	@Test
	public void testDuplicates_HashMap() {
		Assert.assertFalse(Problem_06.containsDuplicate_HashMap(new int[]{}));
		Assert.assertFalse(Problem_06.containsDuplicate_HashMap(null));
		Assert.assertFalse(Problem_06.containsDuplicate_HashMap(new int[]{1}));
		Assert.assertFalse(Problem_06.containsDuplicate_HashMap(new int[]{1, 2}));
		Assert.assertTrue(Problem_06.containsDuplicate_HashMap(new int[]{1, 2, 3, 4, 1}));
		Assert.assertTrue(Problem_06.containsDuplicate_HashMap(new int[]{1, 2, Integer.MAX_VALUE, 4, Integer.MAX_VALUE}));
	}

	/**
	 * Test case to check if an array contains duplicate using hash set
	 */
	@Test
	public void testDuplicates_HashSet() {
		Assert.assertFalse(Problem_06.containsDuplicate_HashSet(new int[]{}));
		Assert.assertFalse(Problem_06.containsDuplicate_HashSet(null));
		Assert.assertFalse(Problem_06.containsDuplicate_HashSet(new int[]{1}));
		Assert.assertFalse(Problem_06.containsDuplicate_HashSet(new int[]{1, 2}));
		Assert.assertTrue(Problem_06.containsDuplicate_HashSet(new int[]{1, 2, 3, 4, 1}));
		Assert.assertTrue(Problem_06.containsDuplicate_HashSet(new int[]{1, 2, Integer.MAX_VALUE, 4, Integer.MAX_VALUE}));
	}

}
