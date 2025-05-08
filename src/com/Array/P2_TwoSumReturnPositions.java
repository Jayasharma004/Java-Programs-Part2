package com.Array;

import java.util.Arrays;
import java.util.HashMap;

//  https://leetcode.com/problems/two-sum/description/
//  Return positions, here the sorting logic won't work
public class P2_TwoSumReturnPositions {
	private static int[] towSum(int[] nums, int target) {
		int []resultPositions = new int[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i< nums.length; i++)
		{
			if(map.containsKey(target-nums[i]))
			{
				resultPositions[0]=i;
				resultPositions[1]=map.get(target-nums[i]);
			}
			map.put(nums[i],i);
		}
		return resultPositions;
	}
	
	public static void main(String[] args) {
		int[] nums = {6,8,3,5,9,10,11,7,15};
		int target = 18;
		int[] finalNumbers = towSum(nums, target);
		System.out.println("result : "+ Arrays.toString(finalNumbers));
	}
}
