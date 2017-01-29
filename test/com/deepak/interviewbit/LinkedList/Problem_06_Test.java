/**
 * InterviewBit
 * Problem_06_Test.java
 */
package com.deepak.interviewbit.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.interviewbit.LinkedList.Problem_06.Node;

/**
 * Test cases for problem 06
 * 
 * @author Deepak
 */
public class Problem_06_Test {

	/* Initialize head node */
	Node node1 = null;

	/* Setup linked list */
	@Before
	public void setup() {
		node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(3);
		Node node5 = new Node(4);
		Node node6 = new Node(4);
		Node node7 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
	}

	/**
	 * Test case to remove all duplicates and keep only unique
	 */
	@Test
	public void testRemoveDuplicatesOnlyUnique() {
		Assert.assertEquals(node1.printForward(), "1->2->3->3->4->4->5");
		Assert.assertEquals(Problem_06.removeDuplicatesOnlyUnique(node1).printForward(), "1->2->3->4->5");
	}

}
