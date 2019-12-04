package com.blblz.adapterdesignpattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	//Using Composition for adapter pattern
	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}
	
	private Volt convertVolt(Volt v, int i) {
		
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get12Volt() {
		Volt v  = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v  = socket.getVolt();
		return convertVolt(v, 40);
	}

}
