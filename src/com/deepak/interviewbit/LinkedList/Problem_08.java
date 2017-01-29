/**
 * InterviewBit
 * Problem_08.java
 */
package com.deepak.interviewbit.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_08 {

	/**
	 * Method to rotate a linked list clockwise when head node
	 * and a value of k is given 
	 * 
	 * @param head
	 * @param k
	 * @return {@link Node}
	 */
	public static Node rotateList(Node head, int k) {
		/* If head is null or k is less then or equal to zero,
		 * no need to rotate the list */
		if (head == null || k <= 0) {
			return head;
		}

		/* Have a pointer to head node */
		Node temp = head;
		/* Move till last element and find the size */
		int size = 1;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		/* Make it a circular list and then break from k'th node */
		temp.next = head;

		/* Let k'th node is zero, if k is equal to or less then size, 
		 * we can get k'th node by size - k. But if it is bigger then size,
		 * then we need to find mod first and then subtract it from size */
		int kthNode = 0;
		if (k > size) {
			kthNode = size - (k % size);
		} else {
			kthNode = size - k;
		}

		/* Loop till k'th node and break it i.e set next to null */
		for (int i = 0; i < kthNode; i++) {
			temp = temp.next;
			head = head.next;
		}
		temp.next = null;
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

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

	}

}
