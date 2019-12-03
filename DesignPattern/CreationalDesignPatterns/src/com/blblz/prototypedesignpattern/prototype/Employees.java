package com.blblz.prototypedesignpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	private List<String> emplist;
	public Employees()
	{
		emplist = new ArrayList<String>();
	}
	
	public Employees(List<String> list)
	{
		this.emplist=list;
	}
	
	public void loadData()
	{
		//read all employees from database and put into the list
		emplist.add("Sudeep");
		emplist.add("Kavya");
		emplist.add("Amit");
		emplist.add("Anand");
		emplist.add("Selvan");
	}
	
	public List<String> getemplist()
	{
		return emplist;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		List<String> temp = new ArrayList<String>();
		
		for(String s : this.getemplist())
		{
			temp.add(s);
		}
		return new Employees(temp);
	}

}