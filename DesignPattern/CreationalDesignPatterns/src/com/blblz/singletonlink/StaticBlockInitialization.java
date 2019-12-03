package com.blblz.singletonlink;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		StaticBlockInitialization block = StaticBlockInitialization.getInstance();
		StaticBlockInitialization block1 = StaticBlockInitialization.getInstance();
		System.out.println("the address of 1st block " + block.hashCode());
		System.out.println("the address of 1st block " + block1.hashCode());
	}
}
