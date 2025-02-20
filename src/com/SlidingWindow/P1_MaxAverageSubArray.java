package com.SlidingWindow;

// https://leetcode.com/problems/maximum-average-subarray-i/description/
// Find a contiguous subarray whose length is equal to k
public class P1_MaxAverageSubArray {
	
	public static double findMaxAverage(int[] nums, int k) {
		int currentSum=0;
		for(int i=0; i<k; i++)
		{
			currentSum=currentSum+nums[i];
		}
		int maxSum = currentSum;
		// Slide the window over the array
		for(int i=k; i< nums.length;i++)
		{
			currentSum = currentSum + (nums[i] - nums[i-k]); // Add the next element and remove the first element of the previous window
			maxSum = Math.max(maxSum,currentSum); // Update maxSum if the new sum is greater
		}
		return (double)maxSum/k;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		System.out.println("Maximum average: " + findMaxAverage(nums, k));
	}
}
