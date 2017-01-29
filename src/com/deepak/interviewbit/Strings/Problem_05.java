package com.deepak.interviewbit.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 * 
 * 
 * @author Deepak
 *
 */
public class Problem_05 {
	
	public static void main(String[] args) {
		System.out.println(reverseString("the sky is blue"));
		System.out.println(reverseString("  the  sky is   blue      "));
	}
	
	public static String reverseString(String input) {
		if (input == null || input == " ") {
			return null;
		}
		List<String> words = new ArrayList<>();
		String[] strArray = input.split(" ");
		for (String string : strArray) {
			if (!string.isEmpty()) {
				words.add(0, string);
			}
		}
		return String.join(" ", words);
	}

}
