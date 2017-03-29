/**
 * LeetCode
 * Problem_09.java
 */
package com.deepak.leetcode.Arrays;

/**
 * <br> Problem Statement :
 * 
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_09 {
	
	/**
	 * Method to add plus one to an array
	 * 
	 * @param digits
	 * @return {@link int[]}
	 */
	public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
        	return new int[]{};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

}
