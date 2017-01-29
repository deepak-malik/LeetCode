/**
 * InterviewBit
 * Problem_04.java
 */
package com.deepak.interviewbit.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list.
 * 
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	/**
	 * Method to remove all duplicates
	 * 
	 * @param head
	 * @return {@link Node}
	 */
	public static Node removeDuplicatesAll(Node head) {
		/* If head is null, or we have just one element, return head */
		if (head == null || head.next == null) {
			return head;
		}
		/* Create a new helper node in front and add it to the list */
		Node helper = new Node(0);
		helper.next = head;
		/* Have 2 pointers, prev and current */
		Node prev = helper;
		Node current = head;
		/* Keep going until current is not null */
		while (current != null) {
			/* If current's next node is not null and data matches, move current */
			while (current.next != null && prev.next.data == current.next.data) {
				current = current.next;
			}
			/* If we are still at current, move previous else,
			 * make current's next as prev's next */
			if (prev.next == current) {
				prev = prev.next;
			} else {
				prev.next = current.next;
			}
			/* Increment current */
			current = current.next;
		}
		/* Return head i.e helper.next */
		return helper.next;
	}

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
