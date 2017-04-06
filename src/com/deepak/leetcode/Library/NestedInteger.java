/**
 * LeetCode
 * NestedInteger.java
 */
package com.deepak.leetcode.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Nested Integer
 * 
 * @author Deepak
 */
public class NestedInteger {

	private List<NestedInteger> list;
	private Integer integer;

	/* Constructors */
	public NestedInteger() {
		this.list = new ArrayList<>();
	}

	public NestedInteger(Integer integer){
		this.integer = integer;
	}

	public NestedInteger(List<NestedInteger> list){
		this.list = list;
	}

	public void add(NestedInteger nestedInteger) {
		if (this.list != null) {
			this.list.add(nestedInteger);
		} else {
			this.list = new ArrayList<>();
			this.list.add(nestedInteger);
		}
	}

	public void setInteger(int num) {
		this.integer = num;
	}

	public boolean isInteger() {
		return integer != null;
	}

	public Integer getInteger() {
		return integer;
	}

	public List<NestedInteger> getList() {
		return list;
	}

}
