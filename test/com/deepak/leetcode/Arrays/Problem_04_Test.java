/**
 * LeetCode
 * Problem_04_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Test case to check minimum moves needed
	 */
	@Test
	public void testMinMoves() {
		Assert.assertEquals(Problem_04.minMoves(new int[]{1, 2, 3}), 3);
		Assert.assertEquals(Problem_04.minMoves(new int[]{1, 2, 3, 4}), 6);
		Assert.assertEquals(Problem_04.minMoves(new int[]{1, 2, 3, 8}), 10);
		Assert.assertEquals(Problem_04.minMoves(new int[]{0, 0 , 0}), 0);
		Assert.assertEquals(Problem_04.minMoves(new int[]{0, 0 , 1}), 1);
		Assert.assertEquals(Problem_04.minMoves(new int[]{0, 0 , 10000}), 10000);
	}

}
