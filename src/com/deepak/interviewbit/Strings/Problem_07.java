package com.deepak.interviewbit.Strings;

/**
 * Compare two version numbers version1 and version2.

If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0.
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 1.13 < 1.13.4

 * @author Deepak
 *
 */
public class Problem_07 {
	
	public static void main(String[] args) {
		System.out.println(compareVersionNumbers("1.13.4", "1.13"));
		System.out.println(compareVersionNumbers("1.13.4.3.4", "1.13"));
		System.out.println(compareVersionNumbers("1.13.4", "1.13.4"));
		System.out.println(compareVersionNumbers("", ""));
		System.out.println(compareVersionNumbers(null, null));
		System.out.println(compareVersionNumbers("1.13.4", "1.13.4.3.4"));
	}

	public static int compareVersionNumbers(String A, String B) {
		if (A == null || A.isEmpty() || B == null || B.isEmpty()) {
			return 0;
		}
		
		// Better Version
		int lengthOfLoop = A.length();
		if (A.length() > B.length()) {
			lengthOfLoop = B.length();
		}
		for (int i = 0; i < lengthOfLoop; i++) {
			if ((A.charAt(i) == B.charAt(i)) || (A.charAt(i) == '.' && B.charAt(i) == '.')) {
				continue;
			}
			if (A.charAt(i) > B.charAt(i)) {
				return 1;
			}
			if (B.charAt(i) > A.charAt(i)) {
				return -1;
			}
			if (A.length() > B.length()) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}
}
