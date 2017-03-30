/**
 * LeetCode
 * Problem_10_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 10
 * 
 * @author Deepak
 */
public class Problem_10_Test {

	/**
	 * Test case to remove duplicates from sorted array
	 */
	@Test
	public void testRemoveDuplicates() {
		Assert.assertEquals(Problem_10.removeDuplicates(new int[]{}), 0);
		Assert.assertEquals(Problem_10.removeDuplicates(null), 0);
		Assert.assertEquals(Problem_10.removeDuplicates(new int[]{1, 1, 2}), 2);
		Assert.assertEquals(Problem_10.removeDuplicates(new int[]{1, 1, 1, 3, 3, 4, 4, 5}), 4);
		Assert.assertEquals(Problem_10.removeDuplicates(new int[]{11, 19, 19}), 2);
	}

}
