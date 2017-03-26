/**
 * InterviewBit
 * Problem_19.java
 */
package com.deepak.leetcode.Trees;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 *  
 * PreOrder traversal of Binary Tree
 * => Root -> Left -> Right
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_19 {

	/**
	 * Method to traverse tree using PreOrder
	 * Note : Recursive Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse all the nodes in the tree
	 * Space Complexity : O(1) => No extra space needed
	 * 
	 * @param root
	 */
	public static <T> void preOrderTraversal_Recursive(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preOrderTraversal_Recursive(root.getLeft());
		preOrderTraversal_Recursive(root.getRight());
	}

	/**
	 * Method to traverse tree using PreOrder
	 * Note : Iterative Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse through all the nodes in the tree
	 * Space Complexity : O(n) => In worst case, all n elements will be pushed to stack
	 * 
	 * @param root
	 * @return {@link ArrayList<T>}
	 */
	public static <T> ArrayList<T> preOrderTraversal_Iterative(TreeNode<T> root) {
		/* If root is null, no need to process further */
		if (root == null) {
			return null;
		}
		/* ArrayList to store result */
		ArrayList<T> result = new ArrayList<>();
		/* Stack to temporarily hold the nodes */
		Stack<TreeNode<T>> stack = new Stack<>();
		/* Push root to stack and keep checking if stack is not empty */
		stack.push(root);
		while (!stack.isEmpty()) {
			/* Pop the node out of stack and check for its child's
			 * Here, right node goes first because while popping out
			 * we need left node on top */
			TreeNode<T> node = stack.pop();
			result.add(node.getData());
			if (node.getRight() != null) {
				stack.push(node.getRight());
			}
			if (node.getLeft() != null) {
				stack.push(node.getLeft());
			}
		}
		return result;
	}

}
