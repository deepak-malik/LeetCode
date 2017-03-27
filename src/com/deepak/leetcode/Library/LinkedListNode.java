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

	private T data;
	private LinkedListNode<T> next;

	/* Constructor */
	private LinkedListNode(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "LinkedListNode [data=" + data + "]";
	}

}
