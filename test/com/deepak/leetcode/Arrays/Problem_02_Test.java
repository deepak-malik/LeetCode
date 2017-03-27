/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to move all zeroes to end
	 */
	@Test
	public void testMoveZeroes() {
		Assert.assertEquals(Arrays.toString(Problem_02.moveZeroes(new int[]{1, 0, 0, 3, 5, 0})), "[1, 3, 5, 0, 0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_02.moveZeroes(new int[]{0, 0, 0})), "[0, 0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_02.moveZeroes(new int[]{1, 2, 3})), "[1, 2, 3]");
	}

}
