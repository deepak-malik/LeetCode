/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.BitManipulation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check single number
	 */
	@Test
	public void testSingleNumber() {
		Assert.assertEquals(Problem_02.singleNumber(new int[]{3, 6, 7, 6, 3}), 7);
		Assert.assertEquals(Problem_02.singleNumber(new int[]{}), -1);
		Assert.assertEquals(Problem_02.singleNumber(null), -1);
	}

}
