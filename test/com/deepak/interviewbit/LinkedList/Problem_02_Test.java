/**
 * InterviewBit
 * Problem_02_Test.java
 */
package com.deepak.interviewbit.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.interviewbit.LinkedList.Problem_02.Node;

/**
 * Test cases for problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check reversal of linked list 
	 * In this case, we have 1->2->3->4->5
	 */
	@Test
	public void testReverseLinkedList() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		Assert.assertEquals(node1.printForward(), "1->2->3->4->5");
		Assert.assertEquals(Problem_02.reverseLinkedList(node1).printForward(), "5->4->3->2->1");
		Assert.assertNull(Problem_02.reverseLinkedList(null));
	}

}
