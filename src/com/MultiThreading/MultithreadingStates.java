package com.MultiThreading;

public class MultithreadingStates extends Thread{
	
	@Override
	public void run() {
		System.out.println("RUNNING"); // RUNNING
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MultithreadingStates t1 = new MultithreadingStates();
		System.out.println(t1.getState()); // NEW
		t1.start();
		System.out.println(t1.getState()); // RUNNABLE
		Thread.sleep(100); //this will call the run() method once the start() is done on thread
		System.out.println(t1.getState()); // TIMED_WAITING
		t1.join();
		System.out.println(t1.getState()); // TERMINATED
	}
}
