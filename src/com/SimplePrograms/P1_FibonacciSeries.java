package com.SimplePrograms;

public class P1_FibonacciSeries {
	private static void generateFibonacci(int n) {
		if(n == 1)
		{
			System.out.println("0");
			return;
		}
		long first=0;
		long second = 1;
		for(int i=3; i<=n; i++)
		{
			long next = first+second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = 7;
		if(n ==0)
		{
			System.out.println("Nothing to print, Enter a number greater than 0");
		}
		else if(n<0)
		{
			System.out.println("Number of series can't be negative");
		}
		else
		{
			System.out.println("Fibonacci Series : ");
			generateFibonacci(n);
		}
		
	}
	
	
}
