package com.Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P3_StringStartsWith {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Tokyo","Paris", "Rome", "Milan", "Mumbai","Moscow");
		System.out.println("Filtering cities name starting with M : ");
		filter(cities,str->str.startsWith("M"));
	}
	
	public static void filter(List<String> cities, Predicate<String> condition)
	{
		for(String city : cities)
		{
			if(condition.test(city))
			{
				System.out.println("city : "+city);
			}
		}
	}
	
}
