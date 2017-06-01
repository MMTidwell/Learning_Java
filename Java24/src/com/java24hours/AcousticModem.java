package com.java24hours;

public class AcousticModem extends Modem {
	String method = "acoustic connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet...");
		System.out.println("Using a " + method);
	}
}
