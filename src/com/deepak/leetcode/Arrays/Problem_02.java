/**
 * InterviewBit
 * Problem_02.java
 */
package com.deepak.leetcode.Arrays;

import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given a non-negative number represented as an array of digits,
 * add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 * Example:
 * If the vector has [1, 2, 3]
 * the returned vector should be [1, 2, 4]
 * as 123 + 1 = 124.
 * 
 * NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
 * For example, for this problem, following are some good questions to ask :
 * Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
 * A : For the purpose of this question, YES
 * Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
 * A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 * 
 * @author Deepak
 */
public class Problem_02 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(addOne(new int[]{9})));
	}
	
	/**
	 * Method to add one to a given number represented as array
	 * 
	 * @param arr
	 * @return {@link int[]}
	 */
	public static int[] addOne(int[] arr) {
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
	}

}
