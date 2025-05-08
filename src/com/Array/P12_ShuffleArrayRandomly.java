package com.Array;

import java.util.Arrays;
import java.util.Random;

public class P12_ShuffleArrayRandomly {
	private static void shuffleRandom(int[] arr) {
		Random random = new Random();
		for(int i=0; i< arr.length; i++)
		{
			int randomIndex = random.nextInt(arr.length);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Shuffled array : "+ Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		P12_ShuffleArrayRandomly.shuffleRandom(arr);
		P12_ShuffleArrayRandomly.shuffleRandom(arr);
		P12_ShuffleArrayRandomly.shuffleRandom(arr);
	}
}
