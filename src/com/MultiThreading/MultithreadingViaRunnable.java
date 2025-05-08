package com.MultiThreading;

public class MultithreadingViaRunnable implements Runnable{
	
	@Override
	public void run() {
		for (; ; ) {
			System.out.println("World");
		}
	}
	public static void main(String[] args) {
		MultithreadingViaRunnable runnable = new MultithreadingViaRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		for (; ; ) {
			System.out.println("Hello");
		}
	}
}
