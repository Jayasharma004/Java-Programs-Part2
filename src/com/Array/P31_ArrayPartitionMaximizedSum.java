package com.Array;

import java.util.Arrays;

//  https://leetcode.com/problems/array-partition/description/
public class P31_ArrayPartitionMaximizedSum {
	private static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=1; i< nums.length; i=i+2)
		{
			sum = sum + Math.min(nums[i-1], nums[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int []nums = {-470, 66, -4835, -5623};
		int result = P31_ArrayPartitionMaximizedSum.arrayPairSum(nums);
		System.out.println("result : "+result);
	}
	
	
}
