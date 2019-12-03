package com.blblz.singletonlink;

public class EagerInitialization {
	private static final EagerInitialization instance = new EagerInitialization();

	// private constructor to avoid client applications to use constructor
	private EagerInitialization() {
	}

	public static EagerInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		EagerInitialization eager = EagerInitialization.getInstance();
		EagerInitialization eager1 = EagerInitialization.getInstance();
		System.out.println("the address of first reffernce" + eager.hashCode());
		System.out.println("the address of second reffernce" + eager1.hashCode());
	}
}
