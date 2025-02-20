package com.GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P3_MinimumNumberOfActivities {
	static class Activity
	{
		int start;
		int end;
		public Activity(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
	}
	public static int maximumActivities(List<Activity> activities) {
		activities.sort(Comparator.comparingInt(value -> value.end));
		int countActivities = 0;
		int lastEndTime = 0;
		for(Activity activity : activities)
		{
			if(activity.start >= lastEndTime)
			{
				countActivities++;
				lastEndTime = activity.end;
			}
		}
		return countActivities;
	}
	
	public static void main(String[] args) {
		// Example inputs
		List<Activity> activities = new ArrayList<>();
		activities.add(new Activity(1, 3));
		activities.add(new Activity(2, 5));
		activities.add(new Activity(3, 9));
		activities.add(new Activity(6, 8));
		activities.add(new Activity(8, 9));
		
		// Output the result
		System.out.println("Maximum number of activities that can be performed: "+ maximumActivities(activities));
	}
}
