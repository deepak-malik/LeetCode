/**
 * InterviewBit
 * Problem_18.java
 */
package com.deepak.leetcode.Trees;

import java.util.ArrayList;
import java.util.Stack;

import com.deepak.leetcode.Library.TreeNode;

/**
 * <br> Problem Statement :
 *  
 * InOrder traversal of Binary Tree
 * => Left -> Root -> Right
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_18 {

	/**
	 * Method to traverse tree using InOrder
	 * Note : Recursive Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse all the nodes in the tree
	 * Space Complexity : O(1) => No extra space needed
	 * 
	 * @param root
	 */
	public static <T> void inOrderTraversal_Recursive(TreeNode<T> root) {
		if (root == null) {
			return;
		}
		inOrderTraversal_Recursive(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrderTraversal_Recursive(root.getRight());
	}

	/**
	 * Method to traverse tree using InOrder
	 * Note : Iterative Approach
	 * 
	 * Time Complexity : O(n) => We need to traverse through all the nodes in the tree
	 * Space Complexity : O(n) => In worst case, all n elements will be pushed to stack
	 * 
	 * @param root
	 * @return {@link ArrayList<T>}
	 */
	public static <T> ArrayList<T> inOrderTraversal_Iterative(TreeNode<T> root) {
		/* ArrayList to store result */
		ArrayList<T> result = new ArrayList<>();
		/* Stack to temporarily store nodes */
		Stack<TreeNode<T>> stack = new Stack<>();
		/* Let current be the root node. Keep traversing 
		 * until either current becomes null or stack is empty */
		TreeNode<T> curr = root;
		while (curr != null || !stack.isEmpty()) {
			/* If current is no null, add to stack and
			 * make current as current's left */
			while (curr != null) {
				stack.add(curr);
				curr = curr.getLeft();
			}
			/* Pop the value, add to the stack and make current
			 * as current's right */
			curr = stack.pop();
			result.add(curr.getData());
			curr = curr.getRight();
		}
		return result;
	}

}
