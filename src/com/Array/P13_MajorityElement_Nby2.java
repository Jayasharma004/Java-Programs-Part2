package com.Array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/description/
public class P13_MajorityElement_Nby2 {
	private static int majorityElement(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i< nums.length; i++)
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
		int majorityElement = 0;
		int threshold = nums.length / 2;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			int element = entry.getKey();
			int count = entry.getValue();
			if (count > threshold)
			{
				majorityElement = element;
			}
		}
		return majorityElement;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int value = P13_MajorityElement_Nby2.majorityElement(nums);
		System.out.println("Majority Element : "+value);
	}
	
	
}
