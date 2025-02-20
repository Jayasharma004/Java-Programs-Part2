package com.Array;

import java.util.Arrays;

// Two-Pointer
//Return numbers with sorting logic
public class P1_TwoSumReturnNumbersAfterSorting {
	
	public static int[] twoSum(int []nums, int target)
	{
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length-1;
		int []resultNumbers = new int[2];
		while(left<right)
		{
			if(nums[left]+nums[right] == target)
			{
				resultNumbers[0] = nums[left];
				resultNumbers[1] = nums[right];
				return resultNumbers;
			}
			if(nums[left]+nums[right]<target)
			{
				left++;
			}
			if(nums[left]+nums[right]>target)
			{
				right--;
			}
		}
		return resultNumbers;
	}
	public static void main(String[] args) {
		int[] nums = {6,8,3,5,9,10,11,7,15};
		int target = 18;
		int[] finalNumbers = twoSum(nums, target);
		System.out.println("result : "+ Arrays.toString(finalNumbers));
		
	}
}
