/**
 * InterviewBit
 * Problem_19_Test.java
 */
package com.deepak.interviewbit.Trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.interviewbit.Library.TreeNode;

/**
 * Test case for Problem 19
 * 
 * @author Deepak
 */
public class Problem_19_Test {

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
	 * Test case to check PreOrder traversal
	 */
	@Test
	public void testPreOrderTraversal() {
		Assert.assertEquals(Problem_19.preOrderTraversal_Iterative(root).toString(), "[3, 2, 5, 7, 9]");
	}

}
