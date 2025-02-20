package com.Array;

public class P19_ConsecutiveOnes {
	private static int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int countOfOne = 0;
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				countOfOne++;
			}
			if(nums[i]!=1)
			{
				result = Math.max(result,countOfOne);
				countOfOne = 0;
			}
		}
		result = Math.max(result, countOfOne);
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 0, 1, 1, 1};
		int result = P19_ConsecutiveOnes.findMaxConsecutiveOnes(nums);
		System.out.println("result : " + result);
	}
}
