package com.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/majority-element-ii/description/
public class P14_MajorityElement_Nby3 {
	
	public static List<Integer> majorityElement(int[] nums)
	{
		Map<Integer, Integer> map = new HashMap<>();
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
		List<Integer> majorityElements = new ArrayList<>();
		int threshold = nums.length / 3;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			int element = entry.getKey();
			int count = entry.getValue();
			if (count > threshold)
			{
				majorityElements.add(element);
			}
		}
		return majorityElements;
	}
	
	public static void main(String[] args)
	{
		int[] nums1 = {3,2,3};  //Output: [3]
		int[] nums2 = {1};      // Output: [1]
		int[] nums3 = {1,2};    // Output: [1,2]
		int[] nums4 = {3,2,2,2,3}; //Output: [2,3]
		List<Integer> resultList1 = P14_MajorityElement_Nby3.majorityElement(nums1);
		List<Integer> resultList2 = P14_MajorityElement_Nby3.majorityElement(nums2);
		List<Integer> resultList3 = P14_MajorityElement_Nby3.majorityElement(nums3);
		List<Integer> resultList4 = P14_MajorityElement_Nby3.majorityElement(nums4);
		System.out.println("resultList1 : "+resultList1);
		System.out.println("resultList2 : "+resultList2);
		System.out.println("resultList3 : "+resultList3);
		System.out.println("resultList4 : "+resultList4);
	}
}
