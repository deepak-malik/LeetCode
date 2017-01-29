/**
 * InterviewBit
 * Problem_06.java
 */
package com.deepak.interviewbit.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Method to remove duplicates keeping only unique
	 * 
	 * @param head
	 * @return {@link head}
	 */
	public static Node removeDuplicatesOnlyUnique(Node head) {
		/* If head is null or we have just one element, return head */
		if (head == null || head.next == null) {
			return head;
		}
		/* Have a current pointer at head */
		Node current = head;
		/* Check for next 2 occurrences for comparison */
		while (current != null && current.next != null) {
			/* If they matches, drop duplicate and mark next node,
			 * else increment current */
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
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

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

	}

}
