/**
 * LeetCode
 * Problem_01.java
 */
package com.deepak.leetcode.Queue;

import java.util.Stack;

/**
 * <br> Problem Statement :
 * 
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * MyQueue class
	 * 
	 * @author Deepak
	 */
	public static class MyQueue {

		Stack<Integer> input = null;
		Stack<Integer> output = null;

		/* Constructor */
		public MyQueue() {
			input = new Stack<>();
			output = new Stack<>();
		}

		/**
		 * Method to push a value to stack
		 * 
		 * @param x
		 */
		public void push(int x) {
			input.push(x);
		}

		/**
		 * Method to remove an element from queue
		 * 
		 * @return {@link int}
		 */
		public int pop() {
			if (output.isEmpty()) {
				moveItemsFromInputToOutput();
			}
			return output.pop();
		}

		/**
		 * Method to peek an element from queue
		 * 
		 * @return {@link int}
		 */
		public int peek() {
			if (output.isEmpty()) {
				moveItemsFromInputToOutput();
			}
			return output.peek();
		}

		/**
		 * Method to check if queue is empty
		 * 
		 * @return {@link boolean}
		 */
		public boolean empty() {
			return input.isEmpty() && output.isEmpty();
		}

		/**
		 * Method to move items from input to output
		 */
		private void moveItemsFromInputToOutput() {
			while (!input.isEmpty()) {
				output.push(input.pop());
			}
		}

	}

}
