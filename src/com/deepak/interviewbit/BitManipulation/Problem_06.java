/**
 * InterviewBit
 * Problem_06.java
 */
package com.deepak.interviewbit.BitManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * <br> Problem Statement :
 * 
 * Given an array of integers, every element appears thrice except for one which occurs once.
 * Find that element which does not appear thrice. 
 * Note: Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *  
 * Example : 
 * Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 * Output : 4
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/* Main method to test the Algorithm */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(1);
		System.out.println(singleNumber(list));
	}

	/**
	 * Returns the number that exists only once
	 * 
	 * @param A - List of Integers
	 * @return {@link int} - Number appearing once
	 */
	public static int singleNumber(final List<Integer> A) {
		int a = 0, b = 0;
		/* Loop through each bit of the list */
		for(int i = 0; i < A.size(); i++) {
			// TODO : Explain this
			int n = (a & ~A.get(i)) | (b & A.get(i));
			b = (b & ~A.get(i)) | (~a & ~b & A.get(i));
			a = n;
		}
		return a | b;
	}

}
