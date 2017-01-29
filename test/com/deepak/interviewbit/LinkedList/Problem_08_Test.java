/**
 * InterviewBit
 * Problem_08_Test.java
 */
package com.deepak.interviewbit.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.interviewbit.LinkedList.Problem_08.Node;

/**
 * Test cases for problem 08
 * 
 * @author Deepak
 */
public class Problem_08_Test {

	/* Initialize head node */
	Node node1;

	/* Setup the list */
	@Before
	public void setup() {
		node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
	}

	/**
	 * Method to test rotation of linked list 
	 */
	@Test
	public void testRotateList() {
		Assert.assertEquals(node1.printForward(), "1->2->3->4->5");
		Assert.assertEquals(Problem_08.rotateList(node1, 2).printForward(), "4->5->1->2->3");
		Assert.assertNull(Problem_08.rotateList(null, 3));
		Assert.assertEquals(Problem_08.rotateList(node1, 0), node1);
		Assert.assertEquals(Problem_08.rotateList(node1, -3), node1);
	}

}
