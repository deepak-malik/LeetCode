/**
 * LeetCode
 * Problem_11_Test.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 11
 * 
 * @author Deepak
 */
public class Problem_11_Test {

	/**
	 * Test case to rotate array using move elements
	 */
	@Test
	public void testRotateArray_MoveElements() {
		Assert.assertEquals(Problem_11.rotate_moveElements(new int[]{}, 3), null);
		Assert.assertEquals(Problem_11.rotate_moveElements(null, 3), null);
		Assert.assertEquals(Arrays.toString(Problem_11.rotate_moveElements(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)), "[5, 6, 7, 1, 2, 3, 4]");
		Assert.assertEquals(Arrays.toString(Problem_11.rotate_moveElements(new int[]{1, 2, 3, 4}, 6)), "[3, 4, 1, 2]");
	}

	/**
	 * Test case to rotate array using reverse
	 */
	@Test
	public void testRotateArray_Reverse() {
		Assert.assertEquals(Problem_11.rotate_reverse(new int[]{}, 3), null);
		Assert.assertEquals(Problem_11.rotate_reverse(null, 3), null);
		Assert.assertEquals(Arrays.toString(Problem_11.rotate_reverse(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)), "[5, 6, 7, 1, 2, 3, 4]");
		Assert.assertEquals(Arrays.toString(Problem_11.rotate_reverse(new int[]{1, 2, 3, 4}, 6)), "[3, 4, 1, 2]");
	}

}
