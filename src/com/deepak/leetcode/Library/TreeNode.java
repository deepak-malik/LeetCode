/**
 * LeetCode
 * TreeNode.java
 */
package com.deepak.leetcode.Library;

/**
 * Node class for Tree
 * 
 * @author Deepak
 */
public class TreeNode<T> {

	private T val;
	private TreeNode<T> left;
	private TreeNode<T> right;

	/* Constructor */
	public TreeNode(T val) {
		this.val = val;
	}

	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}

	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [Val=" + val + "]";
	}

}
