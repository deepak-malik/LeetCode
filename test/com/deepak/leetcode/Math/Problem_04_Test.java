/**
 * LeetCode
 * Problem_04_Test.java
 */
package com.deepak.leetcode.Math;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Method to test happy number
	 */
	@Test
	public void testIsHappyNumber() {
		Assert.assertTrue(Problem_04.isHappy(19));
		Assert.assertTrue(Problem_04.isHappy(82));
		Assert.assertTrue(Problem_04.isHappy(68));
		Assert.assertFalse(Problem_04.isHappy(0));
		Assert.assertTrue(Problem_04.isHappy(1));
	}

}
