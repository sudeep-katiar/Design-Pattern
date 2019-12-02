package com.blblz.singletonlink;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
		BillPughSingleton billobj = BillPughSingleton.getInstance();
		BillPughSingleton billobj1 = BillPughSingleton.getInstance();
		System.out.println("the address of 1st reffernce " + billobj.hashCode());
		System.out.println("the address of 2nd reffernce " + billobj1.hashCode());
	}

}
