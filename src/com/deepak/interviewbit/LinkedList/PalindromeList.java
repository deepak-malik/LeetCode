/**
 * InterviewBit
 * PalindromeList.java
 */
package com.deepak.interviewbit.LinkedList;

import java.util.Stack;

/**
 * <br> Problem Statement :
 * Given a singly linked list, determine if its a palindrome. 
 * Return 1 or 0 denoting if its a palindrome or not, respectively.
 * 
 * Notes: Expected solution is linear in time and constant in space.
 * For example,
 * 	List 1-->2-->1 is a palindrome.
 * 	List 1-->2-->3 is not a palindrome.
 * </br>
 * 
 * @author Deepak
 */
public class PalindromeList {

	/**
	 * Main method to test the algorithm
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(1);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		
		ListNode V = new ListNode(1);
		ListNode W = new ListNode(2);
		ListNode X = new ListNode(3);
		ListNode Y = new ListNode(3);
		ListNode Z = new ListNode(1);
		V.next = W;
		W.next = X;
		X.next = Y;
		Y.next = Z;
		
		System.out.println("Approach 1 by dividing the list into half and reversing it => " + isPalindrome(A));
		System.out.println("Approach 2 by using additional data structure like stack => " + isPalindromeApproach2(V));
	}

	/* Approach : Divide the linked list into half by finding the middle element.
	 * Reverse the first half and then compare the elements, if matches then it's palindrome*/
	public static int isPalindrome(ListNode A) {

		/* Size is needed to keep track of number of elements */
		int size = 0;

		/* Find number of elements in the list */
		ListNode current = A;
		while (null != current) {
			current = current.next;
			size++;
		}

		/* Reset the current node */
		current = A;

		/* Revert the first half of the nodes */
		ListNode previous = null;
		for (int i = 0; i < size/2; i++) {
			ListNode temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}

		/* Previous is the head of reverted first half, 
		 * and current is the head of second half.
		 * If we have odd numbers in the list, then
		 * move the current node to next node */
		if (size % 2 == 1 && previous != null) {
			current = current.next;
		}

		/* Compare the reverted first half and second half */ 
		while (previous != null && current != null) {
			if (previous.val != current.val) {
				return 0;
			}
			previous = previous.next;
			current = current.next;
		}
		return 1;
	}
	
	/* NOTE : This solution is not constant in space as question demands. 
	 * We are using extra space here, because we are creating a new stack. */
	public static int isPalindromeApproach2(ListNode A) {
		/* Stack to hold the entries from the list */
		Stack<Integer> stack = new Stack<>();
		
		/* Fill the stack with entries one by one */
		ListNode temp = A;
		while (temp != null) {
			stack.add(temp.val);
			temp = temp.next;
		}
		
		/* Now, start comparing each element one by one from list and stack */
		ListNode nodeFromList = A;
		while (nodeFromList != null && !stack.isEmpty()) {
			if (nodeFromList.val != stack.pop()) {
				return 0;
			}
			nodeFromList = nodeFromList.next;
		}
		return 1;
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
