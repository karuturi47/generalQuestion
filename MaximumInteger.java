package com.veera.face.book;

public class MaximumInteger {
	public static void main(String[] args) {
		String str = "891";

		int greatestValue = greatestValue(str);

		System.out.println(greatestValue);
	}

	public static int greatestValue(String str) {

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isLetter(str.charAt(i))) {
				if (Character.getNumericValue(str.charAt(i)) <= 1) {

					sum = sum +Character.getNumericValue(str.charAt(i));

				} else {
					if (sum == 0) {

						sum = 1;
					}
					sum = sum * Character.getNumericValue(str.charAt(i));

				}

			}
		}
		System.out.println(sum);

		return sum;

	}

}