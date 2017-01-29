package com.deepak.interviewbit.Strings;

public class Problem_14 {
	
	public static void main(String[] args) {
		System.out.println(isPowerOf2(128));
		
	}
	
	public static int isPowerOf2(int number) {
		if (number < 0) {
			return 0;
		}
		if ((number & (number - 1)) == 0) {
			return 1;
		}
		return 0;
	}

}
