package com.java24hours;

// Starts the program
class AcousticTester {
	public static void main (String[] args) {
		// reinstates the object AcousticModem which extends Modem
		AcousticModem hayes = new AcousticModem();
		System.out.println("Trying the acoustic modem:");
		// sets speed to 300
		hayes.speed = 300;
		// runs method displaySpeed from Modem class
		hayes.displaySpeed();
		// runs connect method from AcousticModem
		hayes.connect();
	}
}
