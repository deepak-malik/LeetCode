/**
 * InterviewBit
 * Problem_07.java
 */
package com.deepak.leetcode.Strings;

/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1,
 * If version1 < version2 return -1,
 * otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits and the . character. 
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", 
 * it is the fifth second-level revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 0.1 < 1.1 < 1.2 < 1.13 < 1.13.4
 * 
 * @author Deepak
 */
public class Problem_07 {

	/**
	 * Method to compare version numbers
	 * 
	 * Time Complexity : O(l) => Where l is length of smaller string
	 * Space Complexity : O(n) => Where n is length of numbers of bigger string
	 * 
	 * @param A
	 * @param B
	 * @return {@link int}
	 */
	public static int compareVersionNumbers(String A, String B) {
		/* If any of the input is null or empty, they can't be equal, return 0 */
		if (A == null || A.isEmpty() || B == null || B.isEmpty()) {
			return 0;
		}
		/* Split both of them by . */
		String[] arrayForA = A.split("\\.");
		String[] arrayForB = B.split("\\.");
		/* Start from 0 and go on until we finish traversing */
		int i = 0;
		while (i < arrayForA.length || i < arrayForB.length) {
			/* If both A and B are available, we need a comparison */
			if (i < arrayForA.length && i < arrayForB.length) {
				if (Integer.parseInt(arrayForA[i]) < Integer.parseInt(arrayForB[i])){
					return -1;
				} else if (Integer.parseInt(arrayForA[i]) > Integer.parseInt(arrayForB[i])){
					return 1;
				}
			} else if (i < arrayForA.length) {
				/* We are done with B, for A check next element is not 0 */
				if (Integer.parseInt(arrayForA[i]) != 0) {
					return 1;
				}
			} else if (i < arrayForB.length) {
				/* We are done with A, for B check next element is not 0 */
				if (Integer.parseInt(arrayForB[i]) != 0) {
					return -1;
				}
			}
			/* Increment the counter for next processing */
			i++;
		}
		/* If none of the condition matches, return 0 */
		return 0;
	}

}
