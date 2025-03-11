package com.SimplePrograms;

public class P2_StringPalindrome {
	public static boolean checkPalindrome(String str)
	{
		String santitizedStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int left = 0;
		int right = santitizedStr.length()-1;
		while(left < right)
		{
			if(santitizedStr.charAt(left) != santitizedStr.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		String input = "123aaaa321";
		if(input == null || input.isEmpty())
		{
			System.out.println("input cannot be empty");
		}
		else
		{
			boolean isPalindrome = checkPalindrome(input);
			if(isPalindrome)
			{
				System.out.println("Given string is palindrome");
			}
			else
			{
				System.out.println("Given string is not palindrome");
			}
		}
	}
}
