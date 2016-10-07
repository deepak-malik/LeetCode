/**
 * InterviewBit
 * AddTwoNumbers.java
 */
package com.deepak.interviewbit.LinkedList;

/**
 * <br> Problem Statement :
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * 342 + 465 = 807
 * Make sure there are no trailing zeros in the output list
 * So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
 * </br>
 * 
 * @author Deepak
 */
public class AddTwoNumbers {

	/**
	 * Main method to test the algorithm
	 * @param args
	 */
	public static void main(String[] args) {
		/* Node A */
		ListNode A1 = new ListNode(3);
		ListNode A2 = new ListNode(4);
		ListNode A3 = new ListNode(2);
		A1.next = A2;
		A2.next = A3;
		System.out.println("List 1 : 3 -> 4 -> 2");

		/* Node B */
		ListNode B1 = new ListNode(4);
		ListNode B2 = new ListNode(6);
		ListNode B3 = new ListNode(5);
		B1.next = B2;
		B2.next = B3;
		System.out.println("List 2 : 4 -> 6 -> 5");

		ListNode headOfNewList = addTwoNumbers(A1, B1);
		System.out.println("Head of new List => " + headOfNewList);
		System.out.println("Addition done. Printing the new list.");
		while (headOfNewList != null) {
			System.out.print(headOfNewList.val + " -> ");
			headOfNewList = headOfNewList.next;
		}
	}

	/* Approach : There are 3 possible cases here,
	 * 		1. When both nodes a and b have equal number of elements.
	 * 		2. When node a has more elements as compared to node b.
	 * 		c. When node b has more elements as compared to node a.
	 * - Add the value of each node from both the lists.
	 * - If sum is greater then 9, then store value of carry into new variable.
	 * - Create the new node with the sum.
	 * - Finally, if carry is still there after we have traversed all the nodes, 
	 * create a new node with carry value */
	public static ListNode addTwoNumbers(ListNode a, ListNode b) {
		/* New dummy node, name it as head */
		ListNode head = new ListNode(0);
		ListNode c = head;
		/* Variable to store carry value */
		int carry = 0;

		/* Case 1 : When both nodes a and b have equal number of elements */
		while (a != null && b != null) {
			int sum = a.val + b.val + carry;
			c.next = new ListNode(sum % 10);
			carry = sum / 10;
			a = a.next;
			b = b.next;
			c = c.next;
		}

		/* Case 2 : When node a has more elements as compared to node b */
		while (a != null) {
			int sum = a.val + carry;
			c.next = new ListNode(sum % 10);
			carry = sum / 10;
			a = a.next;
			c = c.next;
		}

		/* Case 3 : When node b has more elements as compared to node a */
		while (b != null) {
			int sum = b.val + carry;
			c.next = new ListNode(sum % 10);
			carry = sum / 10;
			b = b.next;
			c = c.next;
		}

		/* If carry is left, create a new node using it */
		if (carry != 0) {
			c.next = new ListNode(carry);
		}

		/* Return the head of newly created list */
		return head.next;
	}

	/**
	 * ListNode class 
	 * @author Deepak
	 */
	static class ListNode {

		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x; 
			next = null; 
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + "]";
		}

	}

}
