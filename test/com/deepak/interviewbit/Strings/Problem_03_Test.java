/**
 * InterviewBit
 * Problem_03_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Method to test count and say
	 */
	@Test
	public void testCountAndSay() {
		Assert.assertEquals(Problem_03.countAndSay(0), null);
		Assert.assertEquals(Problem_03.countAndSay(1), "1");
		Assert.assertEquals(Problem_03.countAndSay(2), "11");
		Assert.assertEquals(Problem_03.countAndSay(3), "21");
		Assert.assertEquals(Problem_03.countAndSay(4), "1211");
		Assert.assertEquals(Problem_03.countAndSay(5), "111221");
	}

}
