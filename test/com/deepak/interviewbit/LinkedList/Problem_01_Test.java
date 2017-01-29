/**
 * InterviewBit
 * Problem_01_Test.java
 */
package com.deepak.interviewbit.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.interviewbit.LinkedList.Problem_01.Node;

/**
 * Test cases for problem 01
 * 
 * @author Deepak
 */
public class Problem_01_Test {

	/**
	 * Test case to check intersection of 2 linked lists
	 * Our linked list for this test case is, 
	 * 
	 * 				a1 → a2
	 * 						↘
	 * 						c1 → c2 → c3
	 * 						↗
	 *      	b1 → b2 → b3
	 * 
	 * Intersection is at c1.
	 */
	@Test
	public void testIntersectionOfLinkedList() {
		/* Define nodes of list 1 */
		Node<String> list1_node1 = new Node<String>("a1");
		Node<String> list1_node2 = new Node<String>("a2");
		Node<String> list1_node3 = new Node<String>("c1");
		Node<String> list1_node4 = new Node<String>("c2");
		Node<String> list1_node5 = new Node<String>("c3");

		/* Define nodes of list 2 */
		Node<String> list2_node1 = new Node<String>("b1");
		Node<String> list2_node2 = new Node<String>("b2");
		Node<String> list2_node3 = new Node<String>("b3");

		/* Connect them so that they become similar to above linked list */
		list1_node1.next = list1_node2;
		list1_node2.next = list1_node3;
		list1_node3.next = list1_node4;
		list1_node4.next = list1_node5;
		list1_node5.next = null;
		list2_node1.next = list2_node2;
		list2_node2.next = list2_node3;
		list2_node3.next = list1_node3;

		/* Intersection should be list 1 node 3*/
		Assert.assertEquals(Problem_01.findIntersection(list1_node1, list2_node1), list1_node3);
	}

}
