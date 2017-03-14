/**
 * InterviewBit
 * Problem_14_Test.java
 */
package com.deepak.interviewbit.Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 14
 * 
 * @author Deepak
 */
public class Problem_14_Test {

	/**
	 * Test cases to check if number is power of 2 : Iterative
	 */
	@Test
	public void testIfNumberIsPowerOf2_Iterative() {
		Assert.assertFalse(Problem_14.isPowerOf2_Iterative(0));
		Assert.assertTrue(Problem_14.isPowerOf2_Iterative(64));
		Assert.assertTrue(Problem_14.isPowerOf2_Iterative(1073741824));
	}

	/**
	 * Test cases to check if number is power of 2 : Recursive
	 */
	@Test
	public void testIfNumberIsPowerOf2_Recursive() {
		Assert.assertFalse(Problem_14.isPowerOf2_Recursive(0));
		Assert.assertTrue(Problem_14.isPowerOf2_Recursive(64));
		Assert.assertTrue(Problem_14.isPowerOf2_Recursive(1073741824));
	}

	/**
	 * Test cases to check if number is power of 2 : Bits
	 */
	@Test
	public void testIfNumberIsPowerOf2_Bits() {
		Assert.assertFalse(Problem_14.isPowerOf2_Bits(0));
		Assert.assertTrue(Problem_14.isPowerOf2_Bits(64));
		Assert.assertTrue(Problem_14.isPowerOf2_Bits(1073741824));
	}

	/**
	 * Test cases to check if number is power of 2 : Maths
	 */
	@Test
	public void testIfNumberIsPowerOf2_Math() {
		Assert.assertFalse(Problem_14.isPowerOf2_Math(0));
		Assert.assertTrue(Problem_14.isPowerOf2_Math(64));
		Assert.assertTrue(Problem_14.isPowerOf2_Math(1073741824));
	}

}
