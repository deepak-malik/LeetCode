/**
 * LeetCode
 * Problem_05_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to find majority element using sorting
	 */
	@Test
	public void testMajorityElementSort() {
		Assert.assertEquals(Problem_05.majorityElement_Sort(new int[]{1}), 1);
		Assert.assertEquals(Problem_05.majorityElement_Sort(new int[]{}), -1);
		Assert.assertEquals(Problem_05.majorityElement_Sort(new int[]{2, 4, 4, 5, 4}), 4);
	}

	/**
	 * Test case to find majority element using hash map
	 */
	@Test
	public void testMajorityElementHashMap() {
		Assert.assertEquals(Problem_05.majorityElement_HashMap(new int[]{1}), 1);
		Assert.assertEquals(Problem_05.majorityElement_HashMap(new int[]{}), -1);
		Assert.assertEquals(Problem_05.majorityElement_HashMap(new int[]{2, 4, 4, 5, 4}), 4);
	}

	/**
	 * Test case to find majority element using moore's voting algorithm
	 */
	@Test
	public void testMajorityElementMooresVotingAlgorithm() {
		Assert.assertEquals(Problem_05.majorityElement_MooreVotingAlgorithm(new int[]{1}), 1);
		Assert.assertEquals(Problem_05.majorityElement_MooreVotingAlgorithm(new int[]{}), -1);
		Assert.assertEquals(Problem_05.majorityElement_MooreVotingAlgorithm(new int[]{2, 4, 4, 5, 4}), 4);
	}

}
