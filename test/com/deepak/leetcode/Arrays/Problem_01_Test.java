/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case for two sum
	 */
	@Test
	public void testTwoSum() {
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum(new int[]{}, 9)), "[0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum(null, 9)), "[0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum(new int[]{2, 7, 8, 1, 9}, 32)), "[0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum(new int[]{2, 7, 5, 3}, 9)), "[0, 1]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum(new int[]{2, 7, Integer.MAX_VALUE, 2147483646, 1}, Integer.MAX_VALUE)), "[3, 4]");
	}

}
