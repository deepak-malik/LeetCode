/**
 * LeetCode
 * Problem_07_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 07
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	/**
	 * Test case to find first missing number
	 */
	@Test
	public void firstMissingNumber() {
		Assert.assertEquals(Problem_07.missingNumber(null), -1);
		Assert.assertEquals(Problem_07.missingNumber(new int[]{}), -1);
		Assert.assertEquals(Problem_07.missingNumber(new int[]{0,1,2,3,5}), 4);
	}

	/**
	 * Test case to find first missing number using binary search
	 */
	@Test
	public void firstMissingNumber_BinarySearch() {
		Assert.assertEquals(Problem_07.missingNumer_BinarySearch(null), -1);
		Assert.assertEquals(Problem_07.missingNumer_BinarySearch(new int[]{}), -1);
		Assert.assertEquals(Problem_07.missingNumer_BinarySearch(new int[]{0,1,2,3,5}), 4);
	}

	/**
	 * Test case to find first missing number using XOR
	 */
	@Test
	public void firstMissingNumber_XOR() {
		Assert.assertEquals(Problem_07.missingNumber_XOR(null), -1);
		Assert.assertEquals(Problem_07.missingNumber_XOR(new int[]{}), -1);
		Assert.assertEquals(Problem_07.missingNumber_XOR(new int[]{0,1,2,3,5}), 4);
	}

}
