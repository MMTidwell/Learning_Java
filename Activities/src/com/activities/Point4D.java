package com.activities;

// Inherits from Point3D bringing in points x, y, and z
public class Point4D extends Point3D {
	private int t = 0;
	
	// keeps track of the x, y, z, and t coordinates
	public Point4D(int x, int y, int z, int t) {
		super(x, y, z);
		setTime(t);
	}
	
	// moves the pointer to specified location
	public void move (int x, int y, int z, int t) {
		this.setTime(t);
		super.move(x, y, z);
	}
	
	// move an obj an amount of x and y values
	public void translate(int x, int y, int z, int t) {
		this.setTime(this.t + t);
		super.translate(x, y, z);
	}
	
	// sets the time, and ensures that it is not a negative time
	public void setTime (int t) {
		if (t > 0) {
			this.t = t;
		}
	}
	
	// sends back the time to the class it was called from
	public int getTime() {
		return this.t;
	}
}
