/**
 * 
 */
package com.veera.face.book;

/**
 * @author Veera
 *
 */
public class FibonacciNumber {
	public static void main(String[] args) {
		int[] inputArray = { 1, 4, 3, 9, 10, 13, 7 };
		String output = "";

		for (int i = 0; i < inputArray.length; i++) {
			boolean isFib = isfibonacci(inputArray[i]);
			if (isFib) {
				output = output + inputArray[i] + " ";

			}

		}

		System.out.println(output);

	}

	public static boolean isfibonacci(int n) {
		boolean isperfectSquare = perfectSquare(5 * n * n + 4) || perfectSquare(5 * n * n - 4);

		return isperfectSquare;
	}

	public static boolean perfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s * s == x);

	}
}
