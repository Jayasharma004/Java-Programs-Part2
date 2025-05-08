package com.MultiThreading;

public class MultithreadingExample {
	
	static class MyThread extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - Extending Thread: " + i);
				try {
					Thread.sleep(500); // Pause for 500ms
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	// Thread by implementing Runnable interface
	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " - Implementing Runnable: " + i);
				try {
					Thread.sleep(700); // Pause for 700ms
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread starts!");
		
		// Create thread using the Thread class
		MyThread thread1 = new MyThread();
		
		// Create thread using the Runnable interface
		Thread thread2 = new Thread(new MyRunnable());
		
		// Start both threads
		thread1.start();
		thread2.start();
		
		// Main thread logic
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Main thread: " + i);
			try {
				Thread.sleep(300); // Pause for 300ms
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
		
		System.out.println("Main thread ends!");
	}
}
