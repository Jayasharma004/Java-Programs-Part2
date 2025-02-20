package com.Array;

import java.util.Arrays;

//  https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/
public class P28_MaximumProductDifference {
	private static int maxProductDifference(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int product1=nums[0] * nums[1];
		int product2=nums[n-1]*nums[n-2];
		int result = product2-product1;
		return result;
	}
	
	public static void main(String[] args) {
		int []nums = {4,2,5,9,7,4,8};
		int result = P28_MaximumProductDifference.maxProductDifference(nums);
		System.out.println("result : "+result);
	}
	
	
}
