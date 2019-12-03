package com.blblz.factorypattern.factorytest;

import com.blblz.designpattern.utility.Utility;
import com.blblz.factorypattern.factory.ComputerFactory;
import com.blblz.factorypattern.model.Computer;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.println("Enter the type");
		String type=Utility.StringScanner1();
		System.out.println("Enter hdd");
		String HDD=Utility.StringScanner1();
		System.out.println("Enter cpu");
		String CPU=Utility.StringScanner1();
		System.out.println("Enter ram");
		String RAM=Utility.StringScanner1();
		
		Computer string;
		
			if("Pc".equalsIgnoreCase(type))
			{
				string=ComputerFactory.getComputer(type, HDD, CPU, RAM);
				System.out.println(type);
				System.out.println(string);
			}
			else if("Server".equalsIgnoreCase(type))
			{
				string=ComputerFactory.getComputer(type, HDD, CPU, RAM);
				System.out.println(type);
				System.out.println(string);
			}
			else
			{
				System.out.println("Invalied Type");
			}
	}

}
