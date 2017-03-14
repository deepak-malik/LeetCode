/**
 * InterviewBit
 * Problem_09_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 09
 * 
 * @author Deepak
 */
public class Problem_09_Test {

	/**
	 * Test case to check if string is a valid number
	 */
	@Test
	public void testIsValidNumber() {
		Assert.assertTrue(Problem_09.isStringValidNumber("0"));
		Assert.assertTrue(Problem_09.isStringValidNumber("0.1"));
		Assert.assertFalse(Problem_09.isStringValidNumber("abc"));
		Assert.assertFalse(Problem_09.isStringValidNumber("1 a"));
		Assert.assertTrue(Problem_09.isStringValidNumber("2e10"));
		Assert.assertFalse(Problem_09.isStringValidNumber("e10"));
	}

	/**
	 * Test case to check if string is a valid number using regex
	 */
	@Test
	public void testIsValidNumberUsingRegex() {
		Assert.assertTrue(Problem_09.isStringValidNumber_Regex("0"));
		Assert.assertTrue(Problem_09.isStringValidNumber_Regex("0.1"));
		Assert.assertFalse(Problem_09.isStringValidNumber_Regex("abc"));
		Assert.assertFalse(Problem_09.isStringValidNumber_Regex("1 a"));
		Assert.assertTrue(Problem_09.isStringValidNumber_Regex("2e10"));
		Assert.assertFalse(Problem_09.isStringValidNumber_Regex("e10"));
	}

}
