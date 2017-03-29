/**
 * LeetCode
 * Problem_09_Test.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 09
 * 
 * @author Deepak
 */
public class Problem_09_Test {

	/**
	 * Test case to add one to an array
	 */
	@Test
	public void testPlusOne() {
		Assert.assertEquals(Arrays.toString(Problem_09.plusOne(new int[]{})), "[]");
		Assert.assertEquals(Arrays.toString(Problem_09.plusOne(null)), "[]");
		Assert.assertEquals(Arrays.toString(Problem_09.plusOne(new int[]{9})), "[1, 0]");
		Assert.assertEquals(Arrays.toString(Problem_09.plusOne(new int[]{8, 4, 5})), "[8, 4, 6]");
	}

}
