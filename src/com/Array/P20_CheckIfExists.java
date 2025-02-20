package com.Array;

import java.util.HashMap;
import java.util.Map;

public class P20_CheckIfExists {
	private static boolean checkIfExist(int[] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == 0 && map.containsKey(arr[i]))
			{
				return true;
			}
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],i);
			}
		}
		for(int num : map.keySet())
		{
			if(map.containsKey(2*num))
			{
				int i=map.get(2*num);
				int j=map.get(num);
				if((i!=j) && (0<i) && (j< arr.length))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int []arr = {0,0};
		boolean ifExists = P20_CheckIfExists.checkIfExist(arr);
		System.out.println("ifexists : "+ifExists);
	}
}
