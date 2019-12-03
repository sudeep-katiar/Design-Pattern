package com.blblz.singletonlink;

public enum EnumSingleton {
	instance;

	public static EnumSingleton getinstance() {
		return instance;
	}

	public static void main(String[] args) {
		EnumSingleton enumobj = EnumSingleton.getinstance();
		EnumSingleton enumobj1 = EnumSingleton.getinstance();
		System.out.println("the address of 1st enumobj" + enumobj.hashCode());
		System.out.println("the address of 1st enumobj" + enumobj1.hashCode());
	}

}
