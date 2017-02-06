/**
 * InterviewBit
 * Problem_07_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 07
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	/**
	 * Test case for compare version
	 */
	@Test
	public void testCompareVersion() {
		Assert.assertEquals(Problem_07.compareVersionNumbers("1.13.4", "1.13"), 1);
		Assert.assertEquals(Problem_07.compareVersionNumbers("1.13.4.3.4", "1.13"), 1);
		Assert.assertEquals(Problem_07.compareVersionNumbers("1.13.4", "1.13.4"), 0);
		Assert.assertEquals(Problem_07.compareVersionNumbers("", ""), 0);
		Assert.assertEquals(Problem_07.compareVersionNumbers(null, null), 0);
		Assert.assertEquals(Problem_07.compareVersionNumbers("1.13.4", "1.13.4.3.4"), -1);
		Assert.assertEquals(Problem_07.compareVersionNumbers("1.13.4", "1.13.4.0.0.0"), 0);
	}

}
