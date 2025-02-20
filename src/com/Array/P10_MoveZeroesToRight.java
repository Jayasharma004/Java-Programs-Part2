package com.Array;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class P10_MoveZeroesToRight {
	
	private static void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;
		for(int i=0; i< nums.length; i++)
		{
			if(nums[i]!=0)
			{
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}
		}
		for(int i=nonZeroIndex; i< nums.length; i++)
		{
			nums[i]=0;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2 = {1, 0, 2, 3, 0, 1, 0, 4};
		int[] nums3 = {0, 1, 0, 3, 12};
		P10_MoveZeroesToRight.moveZeroes(nums1);
		P10_MoveZeroesToRight.moveZeroes(nums2);
		P10_MoveZeroesToRight.moveZeroes(nums3);
	}
}
