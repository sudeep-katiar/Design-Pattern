package com.blblz.prototypedesignpattern.prototypetest;

import java.util.List;

import com.blblz.prototypedesignpattern.prototype.Employees;

public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employee = new Employees();
		employee.loadData();
		
		Employees empnew = (Employees) employee.clone();
		Employees empnew1 = (Employees) employee.clone();
		List<String> list = empnew.getemplist();
		list.add("Shivani");
		
		List<String> list1 = empnew1.getemplist();
		list1.remove("Sudeep");
		
		System.out.println("employee list: "+employee.getemplist());
		System.out.println("employee new list: "+list);
		System.out.println("employee new list 1: "+list1);
	}

}
