package com.Array;

import java.util.Arrays;

//   https://leetcode.com/problems/merge-sorted-array/description/
public class P7_MergeTwoSortedArrayII {
	
	private int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n)
	{
		int i = m;
		for(int j=0; j<n; j++)
		{
			nums1[i] = nums2[j];
			i++;
		}
		return nums1;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		int m = 3, n = 3;
		
		/*int[] nums1 = {1};
		int[] nums2 = {};
		int m = 1, n = 0;*/
		
		/*int[] nums1 = {0};
		int[] nums2 = {1};
		int m = 0, n = 1;*/
		
		int[] result = new P7_MergeTwoSortedArrayII().mergeSortedArrays(nums1, m, nums2, n);
		System.out.println("result : "+ Arrays.toString(result));
	}
	
	
	
}
