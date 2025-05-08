package com.GreedyAlgorithms;

public class P1_StockProfitBuySellDay {

	/*
	First part: Buy and sell a stock once, maximize profit.
	n - days
	n-1 - price changes
	Task: Write a method that takes in an array of stock price changes and prints out the maximized profit and the day of buying and the day of selling.
	Example input: 8, -2, -8, 9, -9, 5, 0, 0, -3, 4, -3
	*/
	
	public static void main(String[] args) {
		int []prices = {8, -2, -8, 9, -9, 5, 0, 0, -3, 4, -3};
		int maxProfit = Integer.MIN_VALUE;
		int minPrice = 0;
		int buyDay = 0;
		int sellDay = 0;
		int index = 0;
		
		for(int i=0; i<prices.length; i++)
		{
			// minPrice = Math.min(minPrice, prices[i]);
			// maxProfit = Math.max(maxProfit, prices[i]-minPrice);
			
			if(minPrice > prices[i])
			{
				minPrice = prices[i];
				buyDay = i;
			}
			if(maxProfit < (prices[i]-minPrice))
			{
				maxProfit = prices[i]-minPrice;
				index = buyDay;
				sellDay = i;
			}
		}
		System.out.println("Day of Buying stock : "+index);
		System.out.println("Day of Selling stock : "+sellDay);
		System.out.println("maxProfit : "+maxProfit);
	}
}
