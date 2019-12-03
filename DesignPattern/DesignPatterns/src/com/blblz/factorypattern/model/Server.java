package com.blblz.factorypattern.model;

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public String getRAM() {
		return this.ram;
	}

	public String getHDD() {
		return this.hdd;
	}

	public String getCPU() {
		return this.cpu;
	}
}
