/**
 * InterviewBit
 * Problem_08_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 08
 * 
 * @author Deepak
 */
public class Problem_08_Test {

	/**
	 * Test case to check Atoi
	 */
	@Test
	public void testAtoi() {
		Assert.assertEquals(Problem_08.atoi("0"), 0);
		Assert.assertEquals(Problem_08.atoi("7"), 7);
		Assert.assertEquals(Problem_08.atoi("-9"), -9);
		Assert.assertEquals(Problem_08.atoi(""), 0);
		Assert.assertEquals(Problem_08.atoi("123456"), 123456);
		Assert.assertEquals(Problem_08.atoi(null), 0);
		Assert.assertEquals(Problem_08.atoi("-0"), 0);
		Assert.assertEquals(Problem_08.atoi("2147483648"), Integer.MAX_VALUE);
	}

}
