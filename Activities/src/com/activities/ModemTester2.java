package com.activities;

// starting point for program
public class ModemTester2 {
	public static void main (String[] args) {
		// extends CableModem2 and DslModem2 Objects
		CableModem2 roadRunner = new CableModem2();
		DslModem2 bellSouth = new DslModem2();
		
		// assigns speed variables in Modem2 Parent Object
		roadRunner.speed = 500000;
		bellSouth.speed = 400000;
		
		System.out.println("Trying the cable modem:");
		
		// runs bellow methods in the CableModem2 Object
		roadRunner.displaySpeed();
		roadRunner.connect();
		roadRunner.disconnect();
		
		System.out.println("Trying the DSL modem:");
		
		// runs bellow method in the DslModem2 Object
		bellSouth.displaySpeed();
		bellSouth.connect();
		bellSouth.disconnect();
	}
}
