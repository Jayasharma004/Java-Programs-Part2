package com.Array;

import java.util.Arrays;

public class P9_RotateArrayToLeft {
	private static int[] rotateArrayToLeft(int[] arr, int n) {
	
		for(int i=0; i<n; i++)
		{
			int firstNumber = arr[0];
			for(int j=0; j< arr.length-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = firstNumber;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		int numberOfTimes = 3;
		System.out.println("Original Array : "+ Arrays.toString(arr));
		int [] result = P9_RotateArrayToLeft.rotateArrayToLeft(arr,numberOfTimes);
		System.out.println("Rotated Array : "+ Arrays.toString(result));
	}
	
	
}
