/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Stack;

import java.util.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * Implement the following operations of a stack using queues.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * 
 * Notes:
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * MyStack class
	 * 
	 * @author Deepak
	 */
	public static class MyStack {

		private LinkedList<Integer> queue = null;

		/**
		 * Constructor
		 */
		public MyStack() {
			queue = new LinkedList<>();
		}

		/**
		 * Method to push an item in the stack
		 * 
		 * @param x
		 */
		public void push(int x) {
			queue.add(x);
			int size = queue.size();
			while (size > 1) {
				queue.add(queue.remove());
				size--;
			}
		}

		/**
		 * Method to pop and item from stack
		 * 
		 * @return {@link int}
		 */
		public int pop() {
			return queue.pop();
		}

		/**
		 * Method to get the top element from stack
		 * 
		 * @return {@link int}
		 */
		public int top() {
			return queue.peek();
		}

		/**
		 * Method to check if stack is empty
		 * 
		 * @return {@link boolean}
		 */
		public boolean empty() {
			return queue.isEmpty();
		}

	}

}
