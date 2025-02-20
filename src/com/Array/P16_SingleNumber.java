package com.Array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number/description/
public class P16_SingleNumber {
	private static int singleNumber(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int singleNumber=0;
		for(int i=0;i< nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i],map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				singleNumber= entry.getKey();
			}
		}
		return singleNumber;
	}
	
	public static void main(String[] args) {
		//int[] nums = {4,1,2,1,2};
		int[] nums = {1};
		int result = P16_SingleNumber.singleNumber(nums);
		System.out.println("result : "+result);
	}
}
