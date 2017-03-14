/**
 * InterviewBit
 * Problem_21_Test.java
 */
package com.deepak.interviewbit.Trees;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.interviewbit.Library.TreeNode;

/**
 * Test cases for Problem 21
 * 
 * @author Deepak
 */
public class Problem_21_Test {

	/* Root node of the tree */
	private TreeNode<Integer> root;

	/**
	 * Setting up tree
	 */
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
	 * Test case for level order traversal
	 */
	@Test
	public void testLevelOrderTraversal() {
		ArrayList<TreeNode<Integer>> result = Problem_21.levelOrder(root);
		Assert.assertTrue(result.get(0).getData() == 3);
		Assert.assertTrue(result.get(1).getData() == 2);
		Assert.assertTrue(result.get(2).getData() == 5);
		Assert.assertTrue(result.get(3).getData() == 7);
		Assert.assertTrue(result.get(4).getData() == 9);
	}

}
