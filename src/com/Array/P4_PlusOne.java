package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//  https://leetcode.com/problems/plus-one/description/
public class P4_PlusOne {
	private static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>0;i--)
		{
			if(digits[i]<9)
			{
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		int []result = new int[digits.length+1];
		result[0] = 1;
		return result;
	}
	
	public static void main(String[] args) {
		// Test cases
		int[] input1 = {1, 2, 3};
		int[] input2 = {9, 9, 9};
		int[] input3 = {4, 3, 2, 1};
		int[] input4 = {0};
		
		// Print results for each input
		System.out.println("Input: " + Arrays.toString(input1) + " -> Output: " + Arrays.toString(P4_PlusOne.plusOne(input1)));
		System.out.println("Input: " + Arrays.toString(input2) + " -> Output: " + Arrays.toString(P4_PlusOne.plusOne(input2)));
		System.out.println("Input: " + Arrays.toString(input3) + " -> Output: " + Arrays.toString(P4_PlusOne.plusOne(input3)));
		System.out.println("Input: " + Arrays.toString(input4) + " -> Output: " + Arrays.toString(P4_PlusOne.plusOne(input4)));
		
	}
}
