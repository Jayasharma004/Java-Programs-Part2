package com.Array;

import java.util.Arrays;

public class P6_MergeTwoSortedArrays {
	
	public static int[] sort(int []arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j< arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] merge(int arr1[], int arr2[])
	{
		int mergedArray[] = new int[arr1.length+ arr2.length];
		int sortedArr1[] = P6_MergeTwoSortedArrays.sort(arr1);
		int sortedArr2[] = P6_MergeTwoSortedArrays.sort(arr2);
		
		for(int i=0; i<arr1.length; i++)
		{
			mergedArray[i]=arr1[i];
		}
		for(int i=0; i< arr2.length;i++)
		{
			mergedArray[arr1.length+i]=arr2[i];
		}
		return mergedArray;
	}
	
	
	public static void main(String[] args) {
		int arr1[] = {1, 5, 6, 10};
		int arr2[] = {2, 1, -1, 8};
		int mergedArray[] = P6_MergeTwoSortedArrays.merge(arr1, arr2);
		System.out.println("Sorted Array : "+Arrays.toString(mergedArray));
	}
}
