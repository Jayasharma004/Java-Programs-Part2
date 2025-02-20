package com.Array;

import java.util.Arrays;

// https://leetcode.com/problems/monotonic-array/description/
// https://leetcode.com/problems/monotonic-array/submissions/1528549659/
public class P30_MonotonicIncreasingDecreasingArray {
	public static boolean isMonotonic(int[] nums) {
		if(nums.length==1)
		{
			return true;
		}
		if(isIncreasing(nums) == true)
		{
			return true;
		}
		if(isDecreasing(nums) == true)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isIncreasing(int[] nums)
	{
		boolean isIncreasing = false;
		for(int i=1; i< nums.length; i++)
		{
			if(nums[i-1]<=nums[i])
			{
				isIncreasing = true;
			}
			else
			{
				isIncreasing = false;
				break;
			}
		}
		return isIncreasing;
	}
	public static boolean isDecreasing(int[] nums)
	{
		boolean isDecreasing = false;
		for(int i=0; i< nums.length-1; i++)
		{
			if(nums[i]>=nums[i+1])
			{
				isDecreasing = true;
			}
			else
			{
				isDecreasing = false;
				break;
			}
		}
		return isDecreasing;
	}
	
	public static void main(String[] args) {
		int []nums = {1,3,2};
		//int []nums = {9};
		boolean isMonotonic = P30_MonotonicIncreasingDecreasingArray.isMonotonic(nums);
		System.out.println("isMonotonic : "+isMonotonic);
	}
	
	
}
