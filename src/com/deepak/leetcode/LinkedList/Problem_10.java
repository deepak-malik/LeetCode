package com.deepak.leetcode.LinkedList;


/**
 * Given a singly linked list

    L: L0 → L1 → … → Ln-1 → Ln,
reorder it to:

    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
You must do this in-place without altering the nodes’ values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * @author Deepak
 *
 */
public class Problem_10 {

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		System.out.println(node1.printForward());
		System.out.println(reorderList(node1).printForward());
	}

	public static Node reorderList(Node head) {
		if (head == null) return head;
		Node current = head;
		int size = 1;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		head = reorderList(head, size);
		return head;
	}

	private static Node reorderList(Node head, int size) {
		if (head != null && size > 0) {
			Node current = head;
			Node prev = head;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			Node next = head.next;
			head.next = reorderList(next, size - 2);
			current.next = null;
			prev.next = null;
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
