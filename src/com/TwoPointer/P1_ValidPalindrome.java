package com.TwoPointer;

// https://leetcode.com/problems/valid-palindrome/description/
public class P1_ValidPalindrome {
	public static boolean isPalindrome(String s)
	{
		int left = 0, right = s.length() - 1;
		while (left < right)
		{
			// Move left pointer until it points to an alphanumeric character
			while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
			{
				left++;
			}
			// Move right pointer until it points to an alphanumeric character
			while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
			{
				right--;
			}
			// Compare the characters (case-insensitive)
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
			{
				return false;
			}
			// Move pointers inward
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		String s3 = " ";
		boolean isPalindrome1 = P1_ValidPalindrome.isPalindrome(s1);
		boolean isPalindrome2 = P1_ValidPalindrome.isPalindrome(s2);
		boolean isPalindrome3 = P1_ValidPalindrome.isPalindrome(s3);
		System.out.println("isPalindrome1 : "+isPalindrome1);
		System.out.println("isPalindrome2 : "+isPalindrome2);
		System.out.println("isPalindrome3 : "+isPalindrome3);
	}
}
