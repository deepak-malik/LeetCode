/**
 * InterviewBit
 * Problem_01_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check if a string is palindrome
	 */
	@Test
	public void testIsPalindrome() {
		Assert.assertEquals(Problem_01.isPalindrome("A man, a plan, a canal: Panama"), 1);
		Assert.assertEquals(Problem_01.isPalindrome("race a car"), 0);
		Assert.assertEquals(Problem_01.isPalindrome(""), 1);
		Assert.assertEquals(Problem_01.isPalindrome(null), 1);
		Assert.assertEquals(Problem_01.isPalindrome("pop"), 1);
	}

}
