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
	 * Test case to check two sum when input array is sorted
	 */
	@Test
	public void testTwoSumSorted() {
		Assert.assertEquals(Problem_01.twoSum_Sorted(new int[]{}, 9), null);
		Assert.assertEquals(Problem_01.twoSum_Sorted(new int[]{2, 7, 11, 15}, 10), null);
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum_Sorted(new int[]{2, 7, 11, 15}, 9)), "[0, 1]");
	}

	/**
	 * Test case to check two sum when input array is sorted or unsorted
	 */
	@Test
	public void testTwoSumUnsorted() {
		Assert.assertEquals(Problem_01.twoSum_UnSorted(new int[]{}, 9), null);
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum_UnSorted(new int[]{2, 7, 11, 15}, 10)), "[0, 0]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum_UnSorted(new int[]{2, 7, 11, 15}, 9)), "[0, 1]");
		Assert.assertEquals(Arrays.toString(Problem_01.twoSum_UnSorted(new int[]{1, 7, 9, 2, 3}, 12)), "[2, 4]");
	}

}
