/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.leetcode.Library.LinkedListNode;

/**
 * Test cases for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	LinkedListNode<Integer> head1;
	LinkedListNode<Integer> head2;

	/**
	 * Setting up Linked List
	 * 
	 * Linked List 1 :
	 * 		3 -> 4 -> 6 -> 7
	 * 
	 * Linked List 2 :
	 * 		3 -> 4 -> 6	
	 * 				 /	\
	 * 				9	 7
	 * 				 \	/
	 * 				   8
	 * 
	 */
	@Before
	public void setup() {
		/* Linked List 1 */
		head1 = new LinkedListNode<>(3);
		LinkedListNode<Integer> node1 = new LinkedListNode<>(4);
		LinkedListNode<Integer> node2 = new LinkedListNode<>(6);
		LinkedListNode<Integer> node3 = new LinkedListNode<>(7);
		head1.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);

		/* Linked List 2*/
		head2 = new LinkedListNode<>(3);
		LinkedListNode<Integer> l2_node1 = new LinkedListNode<>(4);
		LinkedListNode<Integer> l2_node2 = new LinkedListNode<>(6);
		LinkedListNode<Integer> l2_node3 = new LinkedListNode<>(7);
		LinkedListNode<Integer> l2_node4 = new LinkedListNode<>(8);
		LinkedListNode<Integer> l2_node5 = new LinkedListNode<>(9);
		head2.setNext(l2_node1);
		l2_node1.setNext(l2_node2);
		l2_node2.setNext(l2_node3);
		l2_node3.setNext(l2_node4);
		l2_node4.setNext(l2_node5);
		l2_node5.setNext(l2_node2);
	}

	/**
	 * Method to test if a linked list has cycle
	 */
	@Test
	public void testHasCycle() {
		Assert.assertFalse(Problem_02.hasCycle(head1));
		Assert.assertTrue(Problem_02.hasCycle(head2));
	}

}
