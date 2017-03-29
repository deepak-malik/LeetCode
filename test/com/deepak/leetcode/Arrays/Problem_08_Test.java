/**
 * LeetCode
 * Problem_08_Test.java
 */
package com.deepak.leetcode.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 08
 * 
 * @author Deepak
 */
public class Problem_08_Test {
	
	/**
	 * Test case to check remove element
	 */
	@Test
	public void testRemoveElement() {
		Assert.assertEquals(Problem_08.removeElement(null, 2), 0);
		Assert.assertEquals(Problem_08.removeElement(new int[]{}, 2), 0);
		Assert.assertEquals(Problem_08.removeElement(new int[]{3, 2, 2, 3}, 3), 2);
	}

}
