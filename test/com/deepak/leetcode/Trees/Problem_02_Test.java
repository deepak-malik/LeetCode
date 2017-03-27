/**
 * LeetCode
 * Problem_02_Test.java
 */
package com.deepak.leetcode.Trees;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.leetcode.Library.TreeNode;

/**
 * Test case for Problem 02
 * 
 * @author Deepak
 */
public class Problem_02_Test {

	/**
	 * Test case to check maximum depth
	 * 			7
	 * 		  /   \
	 * 		 12   19
	 * 		/  \
	 * 	   3    9
	 * 		   /
	 * 		  5		
	 */
	@Test
	public void testMaxDepth() {
		TreeNode<Integer> root = new TreeNode<>(7);
		TreeNode<Integer> node1 = new TreeNode<>(12);
		TreeNode<Integer> node2 = new TreeNode<>(19);
		TreeNode<Integer> node3 = new TreeNode<>(3);
		TreeNode<Integer> node4 = new TreeNode<>(9);
		TreeNode<Integer> node5 = new TreeNode<>(5);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node4.setLeft(node5);
		Assert.assertEquals(Problem_02.maxDepth(root), 4);
	}

}
