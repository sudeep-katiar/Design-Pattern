package com.blblz.singletonlink;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {}
	public static ThreadSafeSingleton getInstance()
	{
		synchronized (ThreadSafeSingleton.class){
		if(instance == null)
		{
			instance = new ThreadSafeSingleton();
			}
		return instance;
	}
}

	public static void main(String[] args) {
		ThreadSafeSingleton threadobj = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadobj1 = ThreadSafeSingleton.getInstance();
		System.out.println("the address of 1st refference threadobj " + threadobj.hashCode());
		System.out.println("the address of 2nd refference threadobj1 " + threadobj1.hashCode());
	}
}
