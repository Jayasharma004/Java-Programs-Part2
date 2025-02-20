package com.GreedyAlgorithms;

// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/

import java.util.Arrays;

public class P4_MinimumCostOfBuyingCandies {
	private int minimumCost(int[] cost) {
		Arrays.sort(cost);
		int minCost = 0;
		if(cost.length<=2)
		{
			for(int c : cost)
			{
				minCost = minCost+c;
			}
			return minCost;
		}
		for(int i=cost.length-1; i>=0; i=i-3)
		{
			if(i==0)
			{
				minCost = minCost+cost[0];
				break;
			}
			minCost =minCost+cost[i]+cost[i-1];
		}
		return minCost;
	}
	
	public static void main(String[] args) {
		P4_MinimumCostOfBuyingCandies mc = new P4_MinimumCostOfBuyingCandies();
		// Test cases
		int[] cost1 = {1, 2, 3};
		System.out.println(mc.minimumCost(cost1)); // Output: 5
		int[] cost2 = {6, 5, 7, 9, 2, 2};
		System.out.println(mc.minimumCost(cost2)); // Output: 23
		int[] cost3 = {5, 5};
		System.out.println(mc.minimumCost(cost3)); // Output: 10
	}
}
