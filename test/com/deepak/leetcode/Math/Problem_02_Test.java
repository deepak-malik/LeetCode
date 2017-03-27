/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.Math;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to add digits
	 */
	@Test
	public void testAddDigits() {
		Assert.assertEquals(Problem_02.addDigits(123), 6);
		Assert.assertEquals(Problem_02.addDigits(23456), 2);
		Assert.assertEquals(Problem_02.addDigits(38), 2);
		Assert.assertEquals(Problem_02.addDigits(0), 0);
		Assert.assertEquals(Problem_02.addDigits(46), 1);
		Assert.assertEquals(Problem_02.addDigits(45), 9);
		Assert.assertEquals(Problem_02.addDigits(123456789), 9);
	}

	/**
	 * Test case to add digits using congruence formula
	 */
	@Test
	public void testAddDigits_CongruenceFormula() {
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(123), 6);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(23456), 2);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(38), 2);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(0), 0);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(46), 1);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(45), 9);
		Assert.assertEquals(Problem_02.addDigits_Congruence_Formula(123456789), 9);
	}

}
