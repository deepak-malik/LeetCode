/**
 * InterviewBit
 * Problem_01.java
 */
package com.deepak.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <br> Problem Statement :
 * 
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 * (x,y) to 
 * (x+1, y), 
 * (x - 1, y), 
 * (x, y+1), 
 * (x, y-1), 
 * (x-1, y-1), 
 * (x+1,y+1), 
 * (x-1,y+1), 
 * (x+1,y-1) 
 * 
 * You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.
 * 
 * Example :
 * Input : [(0, 0), (1, 1), (1, 2)]
 * Output : 2
 * It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_01 {
	
	public static void main(String[] args) {
		ArrayList<Integer> X = new ArrayList<>(Arrays.asList(0, 0));
		ArrayList<Integer> Y = new ArrayList<>(Arrays.asList(1, 2));
		System.out.println(coverPoints(X, Y));
	}

	/**
	 * Method to find minimum steps to move from point X to Y
	 * 
	 * @param X
	 * @param Y
	 * @return {@link int}
	 */
	public static double coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		double numSteps = 0;
        int dx = Math.abs(X.get(1) - X.get(0));
        int dy = Math.abs(Y.get(1) - Y.get(0));
        int min = Math.min(dx, dy);
        int max = Math.max(dx, dy);
        int diagnoalSteps = min;
        int straightSteps = max - min;
        numSteps = (Math.sqrt(2) * diagnoalSteps) + straightSteps;
        return numSteps;
	}

}
