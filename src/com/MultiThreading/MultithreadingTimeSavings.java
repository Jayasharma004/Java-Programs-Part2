package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SumCalculator implements Runnable {
	private long start, end;
	private long partialSum = 0;
	
	public SumCalculator(long start, long end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (long i = start; i <= end; i++) {
			partialSum += i;
		}
	}
	
	public long getPartialSum() {
		return partialSum;
	}
}

public class MultithreadingTimeSavings {
	public static void main(String[] args) throws InterruptedException {
		long range = 4_000_000_000L; // Sum from 1 to 1 billion
		int threadCount = 2000; // Number of threads for the multi-threaded approach
		
		// Single-threaded computation
		long startTime = System.currentTimeMillis();
//		long singleThreadSum = 0;
//		for (long i = 1; i <= range; i++) {
//			singleThreadSum += i;
//		}
		long endTime = System.currentTimeMillis();
//		System.out.println("Single-threaded sum: " + singleThreadSum);
//		System.out.println("Single-threaded time: " + (endTime - startTime) + " ms");
//		Multi-threaded sum: 4011556746686993214
//		Multi-threaded time: 1003 ms
		
		// Multi-threaded computation
		ExecutorService executor = Executors.newFixedThreadPool(threadCount);
		SumCalculator[] tasks = new SumCalculator[threadCount];
		long chunkSize = range / threadCount;
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < threadCount; i++) {
			long start = i * chunkSize + 1;
			long end = (i == threadCount - 1) ? range : (i + 1) * chunkSize;
			tasks[i] = new SumCalculator(start, end);
			executor.execute(tasks[i]);
		}
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		
		long multiThreadSum = 0;
		for (SumCalculator task : tasks) {
			multiThreadSum += task.getPartialSum();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Multi-threaded sum: " + multiThreadSum);
		System.out.println("Multi-threaded time: " + (endTime - startTime) + " ms");
	}
}
