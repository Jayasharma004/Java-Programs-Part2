package com.SimplePrograms;

import java.util.Arrays;

public class P3_AnagramString {
	public static boolean checkAnagram(String str1, String str2)
	{
		String sanitizedStr1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		String sanitizedStr2 = str2.replaceAll("[^a-zA-Z0-9]","");
		if(sanitizedStr1.length() != sanitizedStr2.length())
		{
			return false;
		}
		char[] charArray1 = sanitizedStr1.toCharArray();
		char[] charArray2 = sanitizedStr2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1,charArray2);
	}
	
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		if ((str1 == null || str1.isEmpty()) || (str2 == null || str2.isEmpty()))
		{
			System.out.println("Input strings cannot be null or empty.");
		}
		else
		{
			boolean isAnagram = checkAnagram(str1, str2);
			if (isAnagram)
			{
				System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
			}
			else
			{
				System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
			}
		}
	}
}
