package com.Array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/minimum-common-value/description/
public class P24_MinimumCommonElement {
	private static int getMinimumCommonElement(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map = new HashMap<>();
		int minimumCommonElement = Integer.MAX_VALUE;
		for(int i=0; i< nums1.length; i++)
		{
			if(map.containsKey(nums1[i]))
			{
				map.put(nums1[i], map.get(nums1[i])+1);
			}
			else
			{
				map.put(nums1[i],1);
			}
		}
		for(int i=0; i< nums2.length; i++)
		{
			if(map.containsKey(nums2[i]))
			{
				minimumCommonElement = Math.min(minimumCommonElement,nums2[i]);
			}
		}
		if(minimumCommonElement!=Integer.MAX_VALUE)
			return minimumCommonElement;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		int []nums1 = {1,2,3,6};
		int []nums2 = {2,3,4,5};
		int result = P24_MinimumCommonElement.getMinimumCommonElement(nums1,nums2);
		System.out.println("result : "+result);
	}
}
