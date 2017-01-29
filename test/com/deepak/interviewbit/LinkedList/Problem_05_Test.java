/**
 * InterviewBit
 * Problem_05_Test.java
 */
package com.deepak.interviewbit.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.interviewbit.LinkedList.Problem_05.Node;

/**
 * Test cases for Problem 05
 * 
 * @author Deepak
 */
public class Problem_05_Test {

	/**
	 * Test case to check merging of two sorted lists
	 */
	@Test
	public void testMergeSortedLists() {
		/* Setup List one */
		Node list1_node1 = new Node(7);
		Node list1_node2 = new Node(8);
		Node list1_node3 = new Node(19);
		Node list1_node4 = new Node(27);
		Node list1_node5 = new Node(32);
		list1_node1.next = list1_node2;
		list1_node2.next = list1_node3;
		list1_node3.next = list1_node4;
		list1_node4.next = list1_node5;
		list1_node5.next = null;

		/* Setup List two */
		Node list2_node1 = new Node(5);
		Node list2_node2 = new Node(6);
		Node list2_node3 = new Node(17);
		Node list2_node4 = new Node(23);
		list2_node1.next = list2_node2;
		list2_node2.next = list2_node3;
		list2_node3.next = list2_node4;
		list2_node4.next = null;

		Assert.assertEquals(list1_node1.printForward(), "7->8->19->27->32");
		Assert.assertEquals(list2_node1.printForward(), "5->6->17->23");
		Assert.assertNotNull(Problem_05.mergeTwoSortedLists(list1_node1, list2_node1));
		Assert.assertEquals(Problem_05.mergeTwoSortedLists(list1_node1, list2_node1).printForward(), "5->6->7->8->17->19->23->27->32");
	}

}
