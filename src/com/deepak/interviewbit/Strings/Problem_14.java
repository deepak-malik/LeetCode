/**
 * InterviewBit
 * Problem_14.java
 */
package com.deepak.interviewbit.Strings;

/**
 * <br> Problem Statement :
 * 
 * Check if a number is power of 2
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_14 {

	/**
	 * Method to check if a number is power of 2 
	 * Note : Iterative Approach
	 * 
	 * Time Complexity : O(log n) => We are dividing n by 2 after each call
	 * Space Complexity : O(1)
	 *
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOf2_Iterative(int n) {
		/* If number is 0, It cannot be a power of 2 */
		if (n == 0) {
			return false;
		}
		/* Keep checking if n%2 is 0, If yes, divide by 2.
		 * Finally, we should be left with 1 */
		while (n % 2 == 0) {
			n = n/2;
		}
		return n == 1;
	}

	/**
	 * Method to check if n is power of 2 
	 * Note : Recursive Approach
	 * 
	 * Time Complexity : O(log n) => We are dividing n by 2 after each call
	 * Space Complexity : O(1)
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOf2_Recursive(int n) {
		/* Same logic as iterative */
		return n > 0 && (n == 1 || (n % 2 == 0 && isPowerOf2_Recursive(n/2)));
	}

	/**
	 * Method to check if n is power of 2
	 * Note : Using Bits
	 * 
	 * Time Complexity : O(1)
	 * Space Complexity : O(1)
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOf2_Bits(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

	/**
	 * Method to check if n is power of 2
	 * Note : Using Math
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPowerOf2_Math(int n) {
		/* Range of integers is from -2^31 to 2^31 - 1,
		 * So max possible power of 2 is 2^30 */
		return n > 0 && (Math.pow(2, 30) % n == 0);
	}

}
