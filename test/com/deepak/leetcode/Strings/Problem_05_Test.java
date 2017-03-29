/**
 * LeetCode
 * Problem_05_Test.java
 */
package com.deepak.leetcode.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to reverse vowels
	 */
	@Test
	public void testReverseVowels() {
		Assert.assertEquals(Problem_05.reverseVowels(""), "");
		Assert.assertEquals(Problem_05.reverseVowels(null), null);
		Assert.assertEquals(Problem_05.reverseVowels("hello"), "holle");
		Assert.assertEquals(Problem_05.reverseVowels("leetcode"), "leotcede");
	}

}
