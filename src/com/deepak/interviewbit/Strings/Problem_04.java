package com.deepak.interviewbit.Strings;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.

Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.

 * @author Deepak
 *
 */
public class Problem_04 {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World!"));
		System.out.println(lengthOfLastWord("Deepak Malik"));
		System.out.println(lengthOfLastWord(null));
		System.out.println(lengthOfLastWord("Deepak "));
	}
	
	public static int lengthOfLastWord(String input) {
		if (input == null) {
			return 0;
		}
		StringBuilder builder = new StringBuilder();
		char[] charArray = input.trim().toCharArray();
		for (char c : charArray) {
			if (c != ' ') {
				builder.append(c);
			} else {
				builder = new StringBuilder();
			}
		}
		if (builder.length() > 0) {
			return builder.length();
		}
		return 0;
	}

}
