/**
 * LeetCode
 * Problem_03.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case for two sum when input array is sorted
	 */
	@Test
	public void testTwoSum() {
		Assert.assertEquals(Problem_03.twoSum(new int[]{}, 9), null);
		Assert.assertEquals(Problem_03.twoSum(null, 9), null);
		Assert.assertEquals(Problem_03.twoSum(new int[]{2, 7, 8, 1, 9}, 32), null);
		Assert.assertEquals(Arrays.toString(Problem_03.twoSum(new int[]{2, 3, 5, 7}, 9)), "[1, 4]");
	}

}
