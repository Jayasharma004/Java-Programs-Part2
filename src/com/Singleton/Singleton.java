package com.Singleton;

public class Singleton {
	private static Singleton instance;
	public Singleton()
	{
		System.out.println("Singleton constructor");
	}
	
	public static synchronized Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton(); // Create instance if it does not exist
		}
		return instance;
	}
	public void showMessage()
	{
		System.out.println("Show Message");
	}
	
	public static void main(String[] args) {
		// Accessing the Singleton instance
		Singleton obj1 = Singleton.getInstance();
		obj1.showMessage();
		
		// Trying to create another instance
		Singleton obj2 = Singleton.getInstance();
		obj2.showMessage();
		
		// Verify that obj1 and obj2 are the same instance
		System.out.println("Are obj1 and obj2 the same instance? " + (obj1 == obj2));
	}
}
