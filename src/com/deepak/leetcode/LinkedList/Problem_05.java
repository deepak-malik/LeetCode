/**
 * InterviewBit
 * Problem_05.java
 */
package com.deepak.leetcode.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists, 
 * and should also be sorted.
 * 
 * For example, given following linked lists :
 * 5 -> 8 -> 20 
 * 4 -> 11 -> 15
 * 
 * The merged list should be :
 * 4 -> 5 -> 8 -> 11 -> 15 -> 20
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_05 {

	/**
	 * Method to merge two sorted lists 
	 * 
	 * @param list1
	 * @param list2
	 * @return {@link Node}
	 */
	public static Node mergeTwoSortedLists(Node list1, Node list2) {
		/* If list 1 is null, return list 2 and vice versa */
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		/* Temp node to return */
		Node nodeToReturn = null;
		/* Use recursion, decides list based on the values */
		if (list1.data < list2.data) {
			nodeToReturn = list1;
			nodeToReturn.next = mergeTwoSortedLists(list1.next, list2);
		} else {
			nodeToReturn = list2;
			nodeToReturn.next = mergeTwoSortedLists(list1, list2.next);
		}

		return nodeToReturn;
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
