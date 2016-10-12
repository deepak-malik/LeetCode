/**
 * InterviewBit
 * PartitionList.java
 */
package com.deepak.interviewbit.LinkedList;


/**
 * <br> Problem Statement :
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *  
 * For example, Given 1->4->3->2->5->2 and x = 3, 
 * return 1->2->2->4->3->5. 
 * </br>
 * 
 * @author Deepak
 */
public class PartitionList {

	/* Approach : Scan through the list and */
	public ListNode partition(ListNode head, int b) {
		if(head == null) return null;

		ListNode fakeHead1 = new ListNode(0);
		ListNode fakeHead2 = new ListNode(0);
		fakeHead1.next = head;

		ListNode current = head;
		ListNode previous = fakeHead1;

		while(current != null){
			if(current.val < b){
				current = current.next;
				previous = previous.next;
			}else{

				fakeHead2.next = current;
				previous.next = current.next;

				current = previous.next;
				fakeHead2 = fakeHead2.next;
			} 
		}

		// close the list
		fakeHead2.next = null;

		previous.next = fakeHead2.next;

		return fakeHead1.next;
	}
}

/**
 * ListNode class 
 * @author Deepak
 */
class ListNode {

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
