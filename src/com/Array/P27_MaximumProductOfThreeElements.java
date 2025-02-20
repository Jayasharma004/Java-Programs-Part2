package com.Array;

import java.util.Arrays;

//  https://leetcode.com/problems/maximum-product-of-three-numbers/
// The maximum product can be achieved in two ways:
// 1. Product of the three largest numbers
// 2. Product of the two smallest numbers (negative numbers) and the largest number
public class P27_MaximumProductOfThreeElements {
	private static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int product1 = nums[0]*nums[1]*nums[n-1];
		int product2 = nums[n-1]*nums[n-2]*nums[n-3];
		int result = Math.max(product1,product2);
		return result;
	}
	
	
	public static void main(String[] args) {
		int []nums = {1,2,3};
		int result = P27_MaximumProductOfThreeElements.maximumProduct(nums);
		System.out.println("result : "+result);
	}
	
	
}
