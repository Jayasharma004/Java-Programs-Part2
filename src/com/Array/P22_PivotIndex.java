package com.Array;

//   https://leetcode.com/problems/find-pivot-index/description/
public class P22_PivotIndex {
	
	public static int pivotIndex(int[] nums)
	{
		int leftSum = 0;
		int sum = 0;
		for(int i=0; i< nums.length;i++)
		{
			sum = sum + nums[i];
		}
		for(int i=0; i< nums.length;i++)
		{
			if(leftSum == (sum - leftSum - nums[i]))
			{
				return i;
			}
			leftSum = leftSum + nums[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int []nums = {1,7,3,6,5,6};
		int result = P22_PivotIndex.pivotIndex(nums);
		System.out.println("result : "+result);
	}
	
}
