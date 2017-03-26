/**
 * InterviewBit
 * Problem_20.java
 */
package com.deepak.leetcode.Trees;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 *  
 * PostOrder traversal of Binary Tree
 * => Left -> Right -> Root
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_20 {

	/**
	 * Method to traverse tree using PostOrder
	 * Note : Recursive Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse all the nodes in the tree
	 * Space Complexity : O(1) => No extra space needed
	 * 
	 * @param root
	 */
	public static <T> void postOrderTraversal_Recursive(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		postOrderTraversal_Recursive(root.getLeft());
		postOrderTraversal_Recursive(root.getRight());
		System.out.print(root.getData() + " ");
	}

	/**
	 * Method to traverse tree using PostOrder
	 * Note : Iterative Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse through all the nodes in the tree
	 * Space Complexity : O(n) => In worst case, all n elements will be pushed to stack
	 * 
	 * @param root
	 * @return {@link ArrayList<T>}
	 */
	public static <T> ArrayList<T> postOrderTraversal_Iterative(TreeNode<T> root) {
		/* If root is null, no need to process further */
		if (root == null) {
			return null;
		}
		/* ArrayList to hold results */
		ArrayList<T> result = new ArrayList<>();
		/* Two stacks to hold temporary tree nodes */
		Stack<TreeNode<T>> stack1 = new Stack<>();
		Stack<TreeNode<T>> stack2 = new Stack<>();
		/* Push root to stack 1 and keep traversing until it is empty */
		stack1.push(root);
		while (!stack1.isEmpty()) {
			/* Pop the node out and check of it's child's.
			 * If not empty, push to stack 1 */
			TreeNode<T> node = stack1.pop();
			if (node.getLeft() != null) {
				stack1.push(node.getLeft());
			}
			if (node.getRight() != null) {
				stack1.push(node.getRight());
			}
			/* Push the popped out node to stack 2 */
			stack2.push(node);
		}
		/* Now loop through stack 2 and pop values */
		while (!stack2.isEmpty()) {
			TreeNode<T> node = stack2.pop();
			result.add(node.getData());
		}
		return result;
	}

}
