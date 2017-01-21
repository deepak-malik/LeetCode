/**
 * InterviewBit
 * Problem_02_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases to check for longest common prefix
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check if longest common prefix exists
	 */
	@Test
	public void testLongestCommonPrefix() {
		String[] array1 = {"abcdefgh", "aefghijk", "abcefgh"};
		String[] array2 = {"abcdefgh", "abcghijk", "abcefgh"};
		String[] array3 = {"bcdefgh", "aefghijk", "cbcefgh"};
		String[] array4 = {"a", "a", "a"};
		Assert.assertEquals(Problem_02.longestCommonPrefix(array1), "a");
		Assert.assertEquals(Problem_02.longestCommonPrefix(array2), "abc");
		Assert.assertEquals(Problem_02.longestCommonPrefix(array3), "");
		Assert.assertEquals(Problem_02.longestCommonPrefix(array4), "a");
	}

}
