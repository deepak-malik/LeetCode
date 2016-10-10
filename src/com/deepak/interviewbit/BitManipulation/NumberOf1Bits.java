/**
 * InterviewBit
 * NumberOf1Bits.java
 */
package com.deepak.interviewbit.BitManipulation;

/**
 * <br> Problem Statement ;
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.
 * 
 * Example: 
 * The 32-bit integer 11 has binary representation
 * 0000 0000 0000 0000 0000 0000 0000 1011
 * so the function should return 3.
 * 
 * Note that since Java does not have unsigned int, use long for Java
 * </br>
 *  
 * @author Deepak
 */
public class NumberOf1Bits {

	/* Main method to check the algorithm */
	public static void main(String[] args) {
		long a = 3l;
		System.out.println(Integer.toBinaryString(3));
		System.out.println(numSetBits(a));
	}

	/**
	 * Returns the number of set bits i.e 1 bits
	 * 
	 * @param a - Number
	 * @return {@link int} - Count of number of 1 bits
	 */
	public static int numSetBits(long a) {
		int count = 0;
		/* We will start from left most bit i.e MSB and 
		 * go on until we are done with traversing all the bits */
		while (a > 0) {
			/* If AND of bit and 1 is 1, it means bit is 1.
			 * Increase the count and move to next bit */
			if ((a & 1) != 0) {
				count++;
				a >>= 1;
			}
		}
		return count;
	}

}
