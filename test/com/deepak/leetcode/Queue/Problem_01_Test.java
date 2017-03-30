/**
 * LeetCode
 * Problem_01_Test.java
 */
package com.deepak.leetcode.Queue;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.leetcode.Queue.Problem_01.MyQueue;

/**
 * Test cases for Problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check working of queue
	 */
	@Test
	public void testQueue() {
		MyQueue queue = new MyQueue();
		Assert.assertTrue(queue.empty());
		queue.push(3);
		queue.push(5);
		Assert.assertEquals(queue.peek(), 3);
		Assert.assertEquals(queue.pop(), 3);
		Assert.assertEquals(queue.pop(), 5);
		Assert.assertTrue(queue.empty());
	}

}
