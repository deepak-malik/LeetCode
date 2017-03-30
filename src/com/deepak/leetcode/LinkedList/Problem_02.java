/**
 * LeetCode
 * Problem_02.java
 */
package com.deepak.leetcode.LinkedList;

import com.deepak.leetcode.Library.LinkedListNode;

/**
 * <br> Problem Statement :
 * 
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_02 {

	/**
	 * Method to test if linked list has cycle
	 * 
	 * @param head
	 * @return {@link boolean}
	 */
	public static <T> boolean hasCycle(LinkedListNode<T> head) {
		if (head == null) {
			return false;
		}
		LinkedListNode<T> slow = head;
		LinkedListNode<T> fast = head.getNext();
		while (slow != null && fast != null && fast.getNext() != null) {
			if (slow == fast) {
				return true;
			}
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return false;
	}

}
