/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.Math;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check FizzBuzz
	 */
	@Test
	public void testFizzBuzz() {
		Assert.assertEquals(Problem_01.fizzBuzz(-1), null);
		Assert.assertEquals(Problem_01.fizzBuzz(0), null);
		Assert.assertEquals(Problem_01.fizzBuzz(3).toString(), "[1, 2, Fizz]");
		Assert.assertEquals(Problem_01.fizzBuzz(15).toString(), "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]");
	}

}
