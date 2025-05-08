package com.MultiThreading;

public class MultithreadingViaThread extends Thread{
	
	@Override
	public void run() {
		for (; ; ) {
			System.out.println("World");
		}
	}
	
	public static void main(String[] args) {
		MultithreadingViaThread thread = new MultithreadingViaThread();
		thread.start();
		for (; ; ) {
			System.out.println("Hello");
		}
	}
}
