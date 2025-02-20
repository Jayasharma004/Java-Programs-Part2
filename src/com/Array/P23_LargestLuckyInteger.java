package com.Array;

import java.util.HashMap;
import java.util.Map;

//  https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
public class P23_LargestLuckyInteger {
	private static int findLucky(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		int luckyInteger = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		for(int key : map.keySet())
		{
			if(key == map.get(key))
			{
				luckyInteger = Math.max(luckyInteger,map.get(key));
			}
		}
		return luckyInteger;
	}
	
	public static void main(String[] args) {
		int []arr = {1,2,2,3,3,3};
		int result = P23_LargestLuckyInteger.findLucky(arr);
		System.out.println("result : "+result);
	}
}