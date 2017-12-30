/**
 * 
 */
package com.veera.face.book;

import java.util.Scanner;

/**
 * @author Veera
 *
 */
public class RearrangeOfString {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (scn.hasNext()) {
			String c = scn.next();
			String sortedStr = rearrangeString(c);

			System.out.println(sortedStr);

		}

	}

	public static String rearrangeString(String str) {

		int[] ary = new int[str.length()];

		int sum = 0;
		int j = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				ary[j] = Integer.valueOf(str.charAt(i));
				j++;
			} else {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}

		int[] sorrtedArray = bubbleSorting(ary);

		String sortedStr = arrayToString(sorrtedArray);

		return sortedStr + sum;

	}

	public static String arrayToString(int[] array) {

		String str = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				str = str + (char) array[i];
			}

		}

		return str;

	}

	public static int[] bubbleSorting(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

			}

		}

		return array;
	}

}
