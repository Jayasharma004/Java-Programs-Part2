package com.Array;

import java.util.*;
import java.util.logging.Handler;

//  https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class P18_IntersectionOfArrays_2 {
	private static int[] intersectUsingMapAndList(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int num : nums1)
		{
			if(map.containsKey(num))
			{
				map.put(num,map.get(num)+1);
			}
			else
			{
				map.put(num,1);
			}
		}
		for(int i=0; i< nums2.length; i++)
		{
			if(map.containsKey(nums2[i]))
			{
				list.add(nums2[i]);
				map.put(nums2[i],map.get(nums2[i])-1); // update the map : reduce the count by 1
			}
		}
		int[] intArray = list.stream()
				                 .mapToInt(Integer::intValue)
				                 .toArray();
		return intArray;
	}
	
	public static void main(String[] args) {
		int []nums1 = {4,9,5};
		int []nums2 = {9,4,9,8,4};
		int []nums3 = {1,2,2,1};
		int []nums4 = {2,2};
		int []results1 = P18_IntersectionOfArrays_2.intersectUsingMapAndList(nums1,nums2);
		int []results2 = P18_IntersectionOfArrays_2.intersectUsingMapAndList(nums3,nums4);

		System.out.println("results using 2 maps : "+ Arrays.toString(results1));
		System.out.println("results using single map : "+ Arrays.toString(results2));

	}
	
	
}
