/**
 * InterviewBit
 * TreeNode.java
 */
package com.deepak.leetcode.Library;

/**
 * Node class for Tree
 * 
 * @author Deepak
 */
public class TreeNode<T> {

	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;

	public TreeNode(T data) {
		this.setData(data);
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
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
		return "TreeNode [data=" + data + "]";
	}

}
