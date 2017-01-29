/**
 * InterviewBit
 * SingleNumber1Test.java
 */
package com.deepak.interviewbit.BitManipulation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for finding the lonely integer
 * 
 * @author Deepak
 */
public class SingleNumber1Test {
	
	/* Test Case 1 : When only one integer is present in array */
	@Test
	public void singleNumber1Test1() {
		int[] array = {1};
		Assert.assertEquals(Problem_05.findLonelyInteger(array), 1);
	}
	
	/* Test Case 2 : When more then one integers are present in array */
	@Test
	public void singleNumber1Test2() {
		int[] array = {1, 7, 3, 3, 8, 14, 13, 1, 13, 7, 14};
		Assert.assertEquals(Problem_05.findLonelyInteger(array), 8);
	}
	
	/* Test Case 3 : When array in null */
	@Test
	public void singleNumber1Test3() {
		int[] array = {};
		Assert.assertEquals(Problem_05.findLonelyInteger(array), 0);
	}

}
