package com.java24hours;

// CableModem is a subclass of the superclass Modem
public class CableModem extends Modem {
	String method = "cable connection";
	
	public void connect() {
		System.out.println("Connecting to the Internet ...");
		System.out.println("Using a " + method);
	}
}
