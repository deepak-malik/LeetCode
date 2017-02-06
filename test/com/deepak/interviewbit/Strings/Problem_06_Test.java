/**
 * InterviewBit
 * Problem_06_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/**
	 * Test case for StrStr
	 */
	@Test
	public void testStrStr() {
		Assert.assertEquals(Problem_06.locateSubString(null, "or"), -1);
		Assert.assertEquals(Problem_06.locateSubString("Hello World!!", null), -1);
		Assert.assertEquals(Problem_06.locateSubString(null, null), -1);
		Assert.assertEquals(Problem_06.locateSubString("Hello World!!", "or"), 7);
		Assert.assertEquals(Problem_06.locateSubString("Hello World, How are you", "o"), 4);
	}

}
