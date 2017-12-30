/**
 * Given a list of integers, find the highest product you can get from three of the integers.
 */
package com.veera.face.book;

import java.util.TreeSet;

/**
 * @author Veera
 *
 */
public class LargestThreeMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] inputArray= {3, -10, 7, -10, -2};
		
		int highestMultiplication =largestMultiplication(inputArray);
		
		
		System.out.println(+highestMultiplication);

	}

	private static int largestMultiplication(int[] inputArray) {
	
		
		TreeSet<Integer> tset2 = new TreeSet<Integer>();
		int multiplication=1;
		
		for(int i=0; i<inputArray.length;i++)
		{
			if(inputArray[i]<0)
			{
				tset2.add(inputArray[i] -(2*inputArray[i]));
			}
			else
			{
			tset2.add(inputArray[i]);
			}
		}
		
		for(int i=0; i<3; i++)
		{			
			multiplication=multiplication*tset2.last();
			tset2.remove(tset2.last());
		}
		
		return multiplication;
		
	}

}
