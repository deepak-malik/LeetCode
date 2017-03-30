/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.Stack;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.leetcode.Stack.Problem_01.MyStack;

/**
 * Test case for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check working of stack
	 */
	@Test
	public void testStack() {
		MyStack stack = new MyStack();
		Assert.assertTrue(stack.empty());
		stack.push(3);
		stack.push(5);
		Assert.assertEquals(stack.top(), 5);
		Assert.assertEquals(stack.pop(), 5);
		Assert.assertEquals(stack.pop(), 3);
		Assert.assertTrue(stack.empty());
	}

}
