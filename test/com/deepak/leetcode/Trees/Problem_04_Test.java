/**
 * LeetCode
 * Problem_04_Test.java
 */
package com.deepak.leetcode.Trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.leetcode.Library.TreeNode;

/**
 * Test cases for Problem 04
 * 
 * @author Deepak
 */
public class Problem_04_Test {

	TreeNode<Integer> root1;
	TreeNode<Integer> root2;

	/**
	 * Setting up the tree
	 * 			 3
	 * 			/ \
	 * 		   9  20
	 * 			 /  \
	 * 			15   7
	 */
	@Before
	public void setup() {
		/* Setting up tree 1 */
		root1 = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(9);
		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
		TreeNode<Integer> node3 = new TreeNode<Integer>(15);
		TreeNode<Integer> node4 = new TreeNode<Integer>(7);
		root1.setLeft(node1);
		root1.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);

		/* Setting up tree 2*/
		root2 = new TreeNode<Integer>(3);
		root2.setLeft(node1);
		root2.setRight(node2);
	}

	/**
	 * Method to test same tree recursive
	 */
	@Test
	public void testSameTreeRecursive() {
		Assert.assertTrue(Problem_04.isSameTree_Recursive(root1, root2));
		root1.setLeft(new TreeNode<Integer>(4));
		Assert.assertFalse(Problem_04.isSameTree_Recursive(root1, root2));
	}

	/**
	 * Method to test same tree iterative
	 */
	@Test
	public void testSameTreeIterative() {
		Assert.assertTrue(Problem_04.isSameTree_Iterative(root1, root2));
		root1.setLeft(new TreeNode<Integer>(4));
		Assert.assertFalse(Problem_04.isSameTree_Iterative(root1, root2));
	}

}
