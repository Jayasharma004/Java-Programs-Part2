package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  https://leetcode.com/problems/running-sum-of-1d-array/description/
public class P21_RunningSum {
	private static int[] runningSum(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i=0; i< nums.length; i++)
		{
			sum = sum +nums[i];
			list.add(sum);
		}
		int []resultArray  = list.stream()
			.mapToInt(Integer::intValue)
			.toArray();
		return resultArray;
	}
	
	
	public static void main(String[] args) {
		int []nums = {3,1,2,10,1};
		int []result = P21_RunningSum.runningSum(nums);
		System.out.println("result : "+Arrays.toString(result));
	}
	
	
}
