package com.Array;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 * //Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class P11_ShuffleArrayOnCondition {
	private static int[] shuffle(int[] nums, int n) {
		int[] resultArray = new int[nums.length];
		for(int i=0; i< n; i++)
		{
			resultArray[2*i] = nums[i];
			resultArray[2*i+1] = nums[i+n];
		}
		return resultArray;
	}
	public static void main(String[] args) {
		int []nums = {1,2,3,4,5,6,7,8};
		int n = 4;
		int[] resultArray = P11_ShuffleArrayOnCondition.shuffle(nums,n);
		System.out.println("resultArray : "+ Arrays.toString(resultArray));
	}
}
