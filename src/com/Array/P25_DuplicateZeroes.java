package com.Array;

import java.util.Arrays;

public class P25_DuplicateZeroes {

// https://leetcode.com/problems/duplicate-zeros/description/
	private static void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j > i; j--) {
					arr[j] = arr[j-1];
				}
				i = i + 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
		P25_DuplicateZeroes.duplicateZeros(arr);
	}
	
	
}
