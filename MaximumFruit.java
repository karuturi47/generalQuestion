/**
 * 
 */
package com.veera.face.book;

import java.util.Scanner;

/**
 * @author Veera
 *
 */
public class MaximumFruit {
    private static int mod = 1000000007;
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputCount = scan.nextInt();
		while (inputCount != 0) {
		    int treeCount = scan.nextInt();
		    int seconds = scan.nextInt();
		    int[] trees = new int[treeCount];
		    for (int i = 0; i < treeCount; i++) {
		        trees[i] = scan.nextInt();
		    }
		    int maxFruits = getMaxFruits(trees, seconds);
		    System.out.println(maxFruits);
		    --inputCount;
		}
	}
	
	private static int getMaxFruits(int[] trees, int seconds) {
	    int max = 0;
	    for (int i = 0; i < trees.length; i++) {
	        max = Math.max(max, visit(trees, i, seconds));
	    }
	    return max;
	}
	
	private static int visit(int[] trees, int start, int points) {
	    int i = start;
	    int count = 0;
	    int fruits = 0;
	    while (points != 0 && count < trees.length) {
	        fruits += (trees[i]%mod);
	        fruits = fruits%mod;
	        ++i;
	        ++count;
	        --points;
	        i = i%trees.length;
	    }
	    return fruits;
	}
}
