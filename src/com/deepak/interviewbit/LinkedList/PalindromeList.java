/**
 * InterviewBit
 * PalindromeList.java
 */
package com.deepak.interviewbit.LinkedList;

/**
 * <br>
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
		System.out.println(isPalindrome(A));
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
