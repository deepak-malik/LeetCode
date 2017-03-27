/**
 * LeetCode
 * Problem_03_Test.java
 */
package com.deepak.leetcode.Trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.leetcode.Library.TreeNode;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	TreeNode<Integer> root;

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
		root = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(9);
		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
		TreeNode<Integer> node3 = new TreeNode<Integer>(15);
		TreeNode<Integer> node4 = new TreeNode<Integer>(7);
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
		node2.setRight(node4);
	}

	/**
	 * Test case to find sum of left leaves
	 */
	@Test
	public void testSumOfLeftLeaves_Iterative() {
		Assert.assertEquals(Problem_03.sumOfLeftLeaves_Iterative(root), 24);
	}

	/**
	 * Test case to find sum of left leaves
	 */
	@Test
	public void testSumOfLeftLeaves_Recursive() {
		Assert.assertEquals(Problem_03.sumOfLeftLeaves_Recursive(root), 24);
	}

}
