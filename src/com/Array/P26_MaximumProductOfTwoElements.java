package com.Array;

import java.util.Arrays;

//  https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
public class P26_MaximumProductOfTwoElements {
	
	private static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int result = nums[nums.length-1]*nums[nums.length-2];
		return result;
	}
	
	public static void main(String[] args) {
		int []nums = {1,5,4,5};
		int result = P26_MaximumProductOfTwoElements.maxProduct(nums);
		System.out.println("result : "+result);
	}
	
	
	
}
