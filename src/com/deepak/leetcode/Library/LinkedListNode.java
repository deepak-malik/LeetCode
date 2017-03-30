/**
 * LeetCode
 * LinkedListNode.java
 */
package com.deepak.leetcode.Library;

/**
 * Node class for Linked List
 * 
 * @author Deepak
 *
 * @param <T>
 */
public class LinkedListNode<T> {

	private T val;
	private LinkedListNode<T> next;

	/* Constructor */
	public LinkedListNode(T val) {
		this.setVal(val);
	}

	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "LinkedListNode [val=" + val + "]";
	}

}
