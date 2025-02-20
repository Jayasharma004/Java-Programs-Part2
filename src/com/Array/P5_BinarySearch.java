package com.Array;

public class P5_BinarySearch {
	
	//Mandatory condition : Array must always be sorted
	//time complexity : O(log n) : if the array is already sorted
	//time complexity : O(log n)+O(n log n)=O(n log n) : if the sorting also needs to be done
	private static boolean checkIfNumberPresent(int[] nums, int numToSearch) {
		int left=0;
		int right = nums.length-1;
		
		while(left<=right)
		{
			int middle = (left+right)/2;
			if(nums[middle] == numToSearch)
			{
				return true;
			}
			if(nums[middle] > numToSearch)
			{
				right = middle-1;
			}
			if(nums[middle] < numToSearch)
			{
				left = middle+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 3, 7, 12, 23, 51, 64, 75, 93, 101, 120};
		int numToSearch = 51;
		boolean isNumPresent = checkIfNumberPresent(nums, numToSearch);
		System.out.println("Number " + numToSearch + " is present? " + isNumPresent);
	}
	
	
}
