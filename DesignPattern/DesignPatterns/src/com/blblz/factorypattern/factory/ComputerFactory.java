package com.blblz.factorypattern.factory;

import com.blblz.factorypattern.model.Computer;
import com.blblz.factorypattern.model.PC;
import com.blblz.factorypattern.model.Server;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}

}
