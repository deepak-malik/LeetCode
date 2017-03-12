/**
 * InterviewBit
 * Problem_04_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	/**
	 * Test case to find length of last word
	 */
	@Test
	public void testLengthOfLastWord() {
		Assert.assertEquals(Problem_04.lengthOfLastWord("Hello World!"), 6);
		Assert.assertEquals(Problem_04.lengthOfLastWord("Deepak Malik"), 5);
		Assert.assertEquals(Problem_04.lengthOfLastWord(null), 0);
		Assert.assertEquals(Problem_04.lengthOfLastWord("Hello    "), 5);
	}

	/**
	 * Test case to find length of last word
	 */
	@Test
	public void testLengthOfLastWord_Better() {
		Assert.assertEquals(Problem_04.lengthOfLastWord_Better("Hello World!"), 6);
		Assert.assertEquals(Problem_04.lengthOfLastWord_Better("Deepak Malik"), 5);
		Assert.assertEquals(Problem_04.lengthOfLastWord_Better(null), 0);
		Assert.assertEquals(Problem_04.lengthOfLastWord_Better("Hello    "), 5);
	}

}
