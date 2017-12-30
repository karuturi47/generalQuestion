/**
 * 
 */
package com.veera.face.book;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Veera
 *
 */
public class RearrangeOfStringShort {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (scn.hasNext()) {
			String c = scn.next();
			String sortedStr = rearrangeString(c);

			System.out.println(sortedStr);

		}

	}

	public static String rearrangeString(String str) {

		char[] ary = new char[str.length()];

		int sum = 0;
		int j = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				ary[j] = str.charAt(i);
				j++;
			} else {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}

		Arrays.sort(ary);

		String sortedStr = arrayToString(ary);

		return sortedStr + sum;

	}

	public static String arrayToString(char[] array) {

		String str = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				str = str + (char) array[i];
			}

		}

		return str;

	}

}
