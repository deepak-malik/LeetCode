/**
 * LeetCode
 * Problem_03_Test.java
 */
package com.deepak.leetcode.Math;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to check addition of two strings
	 */
	@Test
	public void testAddStrings() {
		Assert.assertEquals(Problem_03.addStrings("0", "0"), 0);
		Assert.assertEquals(Problem_03.addStrings("9", "11"), 20);
		Assert.assertEquals(Problem_03.addStrings("25", "10"), 35);
		Assert.assertEquals(Problem_03.addStrings("1000", "1500"), 2500);
	}

}
