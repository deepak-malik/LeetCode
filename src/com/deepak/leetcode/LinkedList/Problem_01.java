/**
 * InterviewBit
 * Problem_01.java
 */
package com.deepak.leetcode.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * A:          a1 → a2
 * 						↘
 * 						c1 → c2 → c3
 * 						↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * 
 * NOTE : If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Method to find the intersection of two linked lists when head node is given 
	 * 
	 * @param list1
	 * @param list2
	 * @return {@link Node}
	 */
	public static <T> Node<T> findIntersection(Node<T> list1, Node<T> list2) {
		/* If any of the heads is null, return null */
		if (list1 == null || list2 == null) {
			return null;
		}
		/* Get the result for both the lists */
		Result<T> result1 = getTailAndSize(list1);
		Result<T> result2 = getTailAndSize(list2);

		/* If any of the result is null or tail doesn't match, return null */
		if (result1 == null || result2 == null || result1.tail != result2.tail) {
			return null;
		}

		/* Set pointers to the start of each linked list */
		Node<T> shorter = result1.size < result2.size ? list1 : list2;
		Node<T> longer = result1.size < result2.size ? list2 : list1;

		/* Advance the pointer of longer list to K'th element so that we shred extra elements from longer list */
		longer = getKthNode(longer, Math.abs(result1.size - result2.size));

		/* Move both pointers until they match */
		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}

		/* Return any one of them */
		return shorter;
	}

	/**
	 * Method to get K'th node
	 * 
	 * @param head
	 * @param k
	 * @return {@link Node}
	 */
	private static <T> Node<T> getKthNode(Node<T> head, int k) {
		Node<T> current = head;
		while (k > 0 && current != null) {
			current = current.next;
			k--;
		}
		return current;
	}

	/**
	 * Method to get tail and size of the linked list
	 * 
	 * @param head
	 * @return {@link Result}
	 */
	private static <T> Result<T> getTailAndSize(Node<T> head) {
		/* If head is null, return null */
		if (head == null) {
			return null;
		}
		int size = 0;
		Node<T> current = head;
		/* Keep moving till end and get the size */
		while (current != null) {
			current = current.next;
			size++;
		}
		return new Result<>(current, size);
	}

	/**
	 * Class to hold result 
	 * 
	 * @author Deepak
	 *
	 * @param <T>
	 */
	public static class Result<T> {

		/* Tail and size of the linked list */
		Node<T> tail;
		int size;

		/**
		 * Constructor
		 * @param tail
		 * @param size
		 */
		public Result(Node<T> tail, int size) {
			this.tail = tail;
			this.size = size;
		}

	}

	/**
	 * Class for a Linked list node
	 * 
	 * @author Deepak
	 *
	 * @param <T>
	 */
	public static class Node<T> {

		/* Data and pointer to next node */
		T data;
		Node<T> next;

		/**
		 * Constructor
		 * @param data
		 */
		public Node(T data) {
			this.data = data;
		}

	}

}
