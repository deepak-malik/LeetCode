/**
 * InterviewBit
 * Problem_21.java
 */
package com.deepak.interviewbit.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.deepak.interviewbit.Library.TreeNode;

/**
 * <br> Problem Statement :
 * 
 * Print level order traversal of a binary tree.
 *
 * </br>
 * 
 * @author Deepak
 */
public class Problem_21 {

	/**
	 * Method to print level order traversal of a Binary Tree
	 * 
	 * Time Complexity : O(n) => Where n is number of nodes in the tree
	 * Space Complexity : O(n) => n for array list to store result, and n for queue. So, 2n => n
	 * 
	 * @param root
	 * @return {@link ArrayList<TreeNode<T>>}
	 */
	public static <T> ArrayList<TreeNode<T>> levelOrder(TreeNode<T> root) {
		/* If root is null, no need to process further */
		if (root == null) {
			return null;
		}
		/* Create a ArrayList to hold the result */
		ArrayList<TreeNode<T>> result = new ArrayList<>();
		/* Create a queue for traversal, and add root to it */
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.offer(root);
		/* While queue is not empty, poll the element and add to result.
		 * If element has left or right child, add them to queue */
		while (!queue.isEmpty()) {
			TreeNode<T> node = queue.poll();
			result.add(node);
			if (node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.offer(node.getRight());
			}
		}
		/* Return result */
		return result;
	}

	/**
	 * Method to print tree level by level. Each level has to be printed in new line
	 * 
	 * Time Complexity : O(n) => Where n is number of nodes in the tree
	 * Space Complexity : O(n) => Where n is number of elements pushed to queue
	 * 
	 * @param root
	 */
	public static <T> void printLevelByLevel(TreeNode<T> root) {
		/* If root is null, no further processing required */
		if (root == null) {
			return;
		}
		/* Create a queue to traverse the tree. Add root to it */
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.offer(root);
		/* Let current level be 1 and next level be 0 */
		int currentLevel = 1;
		int nextLevel = 0;
		/* Keep processing while queue is not empty */
		while (!queue.isEmpty()) {
			/* Poll the node from tree and print it.
			 * Reduce current level by 1 */
			TreeNode<T> node = queue.poll();
			if (node != null) {
				System.out.print(node.getData() + " ");
				currentLevel--;
			}
			/* If node has left or right child, increase the next level */
			if (node.getLeft() != null) {
				queue.offer(node.getLeft());
				nextLevel++;
			}
			if (node.getRight() != null) {
				queue.offer(node.getRight());
				nextLevel++;
			}
			/* Once current level becomes 0, move to next line.
			 * Now, current level will become next level and next level will be 0 */
			if (currentLevel == 0) {
				System.out.println();
				currentLevel = nextLevel;
				nextLevel = 0;
			}
		}
	}

}
