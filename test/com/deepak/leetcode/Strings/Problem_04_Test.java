/**
 * LeetCode
 * Problem_04_Test.java
 */
package com.deepak.leetcode.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Test case to reverse a string
	 */
	@Test
	public void testReverseString() {
		Assert.assertEquals(Problem_04.reverseStr("", 2), null);
		Assert.assertEquals(Problem_04.reverseStr(null, 2), null);
		Assert.assertEquals(Problem_04.reverseStr("abcdefg", 2), "bacdfeg");
		Assert.assertEquals(Problem_04.reverseStr("leetcode", 3), "eeltcoed");
	}
}
