/**
 * InterviewBit
 * Problem_05_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Method to test reversal of string
	 */
	@Test
	public void testReverseString() {
		Assert.assertEquals(Problem_05.reverseString("the sky is blue"), "blue is sky the");
		Assert.assertEquals(Problem_05.reverseString("  the  sky is   blue      "), "blue is sky the");
	}

}
