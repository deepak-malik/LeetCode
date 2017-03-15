/**
 * InterviewBit
 * Problem_18_Test.java
 */
package com.deepak.interviewbit.Trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.interviewbit.Library.TreeNode;

/**
 * Test case for Problem 18
 * 
 * @author Deepak
 */
public class Problem_18_Test {

	/* Root node of tree */
	TreeNode<Integer> root;

	/* Setup Tree */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(5);
		TreeNode<Integer> node3 = new TreeNode<Integer>(7);
		TreeNode<Integer> node4 = new TreeNode<Integer>(9);
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
	}

	/**
	 * Test case to check InOrder traversal
	 */
	@Test
	public void testInOrderTraversal() {
		Assert.assertEquals(Problem_18.inOrderTraversal_Iterative(root).toString(), "[2, 3, 7, 5, 9]");
	}

}
