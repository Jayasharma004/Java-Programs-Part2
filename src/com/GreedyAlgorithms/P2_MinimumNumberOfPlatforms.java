package com.GreedyAlgorithms;

public class P2_MinimumNumberOfPlatforms {
	private static int findMinimumPlatforms(int[] arrival, int[] departure) {
		int maxPlatforms = 0;
		int platformsNeeded = 0;
		int i=0, j=0;
		while(i< arrival.length && j<departure.length)
		{
			if(arrival[i] <= departure[j])
			{
				platformsNeeded++;
				i++;
				maxPlatforms = Math.max(maxPlatforms,platformsNeeded);
			}
			else
			{
				platformsNeeded--;
				j++;
			}
		}
		return maxPlatforms;
	}
	
	public static void main(String[] args) {
		int[] arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] departure = {910, 1200, 1120, 1130, 1900, 2000}; //output = 3
		int result = findMinimumPlatforms(arrival, departure);
		System.out.println("Minimum number of platforms required: " + result);
	}
	
	
}
