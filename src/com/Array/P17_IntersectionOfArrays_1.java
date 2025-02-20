package com.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//   https://leetcode.com/problems/intersection-of-two-arrays/description/
public class P17_IntersectionOfArrays_1 {
	public static int[] findIntersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();
		
		for(int num1 : nums1)
		{
			set1.add(num1);
		}
		for(int num2 : nums2)
		{
			if(set1.contains(num2))
			{
				resultSet.add(num2);
			}
		}
		int[] resultArray = new int[resultSet.size()];
		int index=0;
		for(int key : resultSet)
		{
			resultArray[index]=key;
			index++;
		}
		return resultArray;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		System.out.println("Intersection: " + Arrays.toString(P17_IntersectionOfArrays_1.findIntersection(nums1, nums2)));
	}
	
	
}
