/**
 * InterviewBit
 * Problem_02.java
 */
package com.deepak.interviewbit.LinkedList;


/**
 * <br> Problem Statement :
 * 
 * Reverse a linked list. Do it in-place and in one-pass.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL,
 * return 5->4->3->2->1->NULL.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to reverse a linked list
	 * 
	 * @param head
	 * @return {@link Node}
	 */
	public static Node reverseLinkedList(Node head) {
		/* If head is null, return null */
		if (head == null) {
			return null;
		}
		/* Create a copy of head and a temp node prev */
		Node current = head;
		Node prev = null;
		/* Start moving forward. For each current node, temporary
		 * copy it's next node, set it's next to previous and set 
		 * previous to current node. Update head once loop is done */
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		/* Return head */
		return head;
	}

	/**
	 * Class for a Linked list node
	 * 
	 * @author Deepak
	 */
	public static class Node {

		/* Data and pointer to next node */
		Integer data;
		Node next;

		/**
		 * Constructor
		 * @param data
		 */
		public Node(Integer data) {
			this.data = data;
		}

		/**
		 * Method to print forward 
		 * 
		 * @return {@link String}
		 */
		public String printForward() {
			if (next != null) {
				return data + "->" + next.printForward();
			} else {
				return String.valueOf(data);
			}
		}

	}

}
