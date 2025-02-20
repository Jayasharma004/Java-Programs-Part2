package com.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class P2_CountPairsLessThanTarget {
	private static int countPairs(int[] nums, int target) {
		// Sort the array to use the two-pointer technique
		Arrays.sort(nums);
		int count = 0;
		int left = 0;
		int right = nums.length - 1;
		
		// Use two pointers to find pairs
		while (left < right)
		{
			if (nums[left] + nums[right] < target)
			{
				count = count + (right - left);
				left++;
			}
			else
			{
				right--;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int []nums1 = {-1,1,2,3,1};
		int target1 = 2;
		int []nums2 = {-6,2,5,-2,-7,-1,3};
		int target2 = -2;
		int result1 = P2_CountPairsLessThanTarget.countPairs(nums1,target1);
		System.out.println("Result : "+result1);
		int result2 = P2_CountPairsLessThanTarget.countPairs(nums2,target2);
		System.out.println("Result : "+result2);
	}
	
	
}
