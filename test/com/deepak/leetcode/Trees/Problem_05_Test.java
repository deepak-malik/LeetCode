/**
 * LeetCode
 * Problem_05_Test.java
 */
package com.deepak.leetcode.Trees;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to check creation of BST from array
	 */
	@Test
	public void testCreateBST() {
		Assert.assertEquals(Problem_05.sortedArrayToBST(null), null);
		Assert.assertEquals(Problem_05.sortedArrayToBST(new int[]{}), null);
		Assert.assertTrue(Problem_05.sortedArrayToBST(new int[]{0}).getVal() == 0);
		Assert.assertTrue(Problem_05.sortedArrayToBST(new int[]{1, 2, 3, 4, 5}).getVal() == 3);
	}

}
