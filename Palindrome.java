package com.veera.face.book;

public class Palindrome {

	public static void main(String[] args) {
			String inputString="race cars";
			
			
			boolean ispalindrome=findPalindrome(inputString.replaceAll("\\s", ""));
			
					System.out.println(ispalindrome);
	}

	private static boolean findPalindrome(String str) {
		int stringlength=str.length();
		boolean ispalidrome=true;
		
		for(int i=0;i<=stringlength/2;i++)
		{
			if(str.charAt(i)!=str.charAt(stringlength-1-i))
			{
				ispalidrome=false;
			}
			
			
		}
		return ispalidrome;
	}

}
