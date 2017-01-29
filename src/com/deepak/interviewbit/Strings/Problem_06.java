package com.deepak.interviewbit.Strings;

/**
 * Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases. 

 * @author Deepak
 *
 */
public class Problem_06 {
	
	public static void main(String[] args) {
		System.out.println(locateSubString("Deepak", "ep"));
	}
	
	public static int locateSubString(String haystack, String needle) {
		int index = -1;
		if (haystack == null || haystack.isEmpty() || needle == null || needle.isEmpty()) {
			return index;
		}
		for (int i = 0; i < haystack.length(); i++) {
			index = i;
			int j = 0;
			while (i < haystack.length() && j < needle.length()
					&& haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			}
			if (j == needle.length()) {
				// found
				return index;
			}
			i = index;
		}
		return -1;
	}

}
