package com.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class P32_FindAllNumbersDissappearedInAnArray {
	private static List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i< nums.length;i++)
		{
			set.add(nums[i]);
		}
		for(int i=1; i<=nums.length;i++)
		{
			if(!set.contains(i))
			{
				list.add(i);
			}
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		int []nums = {4,3,2,7,8,2,3,1};
		List<Integer> resultList = P32_FindAllNumbersDissappearedInAnArray.findDisappearedNumbers(nums);
		System.out.println("resultList : "+resultList);
	}
	
	
}
