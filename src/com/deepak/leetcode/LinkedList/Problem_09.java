package com.deepak.leetcode.LinkedList;


/**
 * <br> Problem Statement :
 * 
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * return 1->4->3->2->5->NULL.
 * 
 * Note: Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list. 
 * 
 * Note 2: Usually the version often seen in the interviews is 
 * reversing the whole linked list which is obviously an easier version of this question.
 *  
 * @author Deepak
 */
public class Problem_09 {
	
	public static void main(String[] args) {
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
		System.out.println(node1.printForward());
		System.out.println(reverseLinkedListFromMtoN(node1, 2, 4).printForward());
	}
	
	public static Node reverseLinkedListFromMtoN(Node head, int m, int n) {
		if (head == null || m == n) {
			return head;
		}
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node prev = dummy, current = head;
		int pos = 1;
		
		while (pos < m && current != null) {
			prev = current;
			current = current.next;
			pos++;
		}
		
		/* Reverse the list, start moving forward, for each current node
		 * temporary copy its next node. Set it's next to previous and 
		 * previous to current. Update head once loop is done */
		while (pos < n && current != null) {
			Node next = current.next.next;
			current.next.next = prev.next;
			prev.next = current.next;
			current.next = next;
			pos++;
		}
		return dummy.next;
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
