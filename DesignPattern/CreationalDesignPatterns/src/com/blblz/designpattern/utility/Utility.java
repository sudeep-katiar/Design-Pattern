package com.blblz.designpattern.utility;

import java.util.Scanner;

public class Utility {
	
	private final static Scanner sc = new Scanner(System.in);

	public static int intScanner() {
		return sc.nextInt();
	}

	public static boolean booleanScanner() {
		return sc.nextBoolean();
	}

	public static float floatScanner() {
		return sc.nextFloat();

	}
	public static long longScanner() {
		return sc.nextLong();
	}

	public static double doubleScanner() {
		return sc.nextDouble();
	}

	public static String StringScanner() {
		return sc.next();
	}
	
public static String StringScanner1() {
	return sc.nextLine();
}

}
