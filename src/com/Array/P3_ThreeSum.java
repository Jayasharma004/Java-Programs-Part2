package com.Array;
import java.util.*;
//   https://leetcode.com/problems/3sum/description/
public class P3_ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length < 3)
		{
			return result; // No valid triplets
		}
		// Sort the array to use two-pointer technique
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++)
		{
			// Skip duplicates for the first element
			if (i > 0 && nums[i] == nums[i - 1])
			{
				continue;
			}
			int target = - nums[i];
			int left = i + 1, right = nums.length - 1;
			while (left < right)
			{
				int sum = nums[left] + nums[right];
				if (sum == target)
				{
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					
					// Skip duplicates for the second and third elements
					while (left < right && nums[left] == nums[left - 1])
					{
						left++;
					}
					while (left < right && nums[right] == nums[right + 1])
					{
						right--;
					}
				}
				else if (sum < target)
				{
					left++; // Increase sum by moving left pointer
				}
				else
				{
					right--; // Decrease sum by moving right pointer
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> resultList = threeSum(nums);
		System.out.println("resultList : "+resultList);
	}
}
