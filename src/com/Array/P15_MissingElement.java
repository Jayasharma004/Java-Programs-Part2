package com.Array;

//https://leetcode.com/problems/missing-number/description/
public class P15_MissingElement {
	private static int missingNumberUsingSet(int[] nums) {
	
		int n = nums.length;
		int expectedSum = (n*(n+1))/2;
		int existingSum = 0;
		for(int number : nums)
		{
			existingSum = existingSum+number;
		}
		return expectedSum - existingSum;
	}
	
	
	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2 = {3,0,1};
		int[] nums3 = {9,6,4,2,3,5,7,0,1};
		int missingNum1 = P15_MissingElement.missingNumberUsingSet(nums1);
		int missingNum2 = P15_MissingElement.missingNumberUsingSet(nums2);
		int missingNum3 = P15_MissingElement.missingNumberUsingSet(nums3);
		System.out.println("missingNumber : "+missingNum1);
		System.out.println("missingNumber : "+missingNum2);
		System.out.println("missingNumber : "+missingNum3);
	}
	
	
}
