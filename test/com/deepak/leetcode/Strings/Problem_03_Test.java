/**
 * LeetCode
 * Problem_03_Test.java
 */
package com.deepak.leetcode.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to find first unique character
	 */
	@Test
	public void testFirstUniqueChar() {
		Assert.assertEquals(Problem_03.firstUniqChar(null), -1);
		Assert.assertEquals(Problem_03.firstUniqChar(""), -1);
		Assert.assertEquals(Problem_03.firstUniqChar("leetcode"), 0);
		Assert.assertEquals(Problem_03.firstUniqChar("loveleetcode"), 2);
		Assert.assertEquals(Problem_03.firstUniqChar("leetcodeleetcode"), -1);
		Assert.assertEquals(Problem_03.firstUniqChar("codeleetcode"), 4);
	}

}
