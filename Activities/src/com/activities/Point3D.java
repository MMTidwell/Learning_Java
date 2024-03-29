package com.activities;

//allows access to the Point obj
import java.awt.*;

//accessing Point class allowing usage of x and y
public class Point3D extends Point {
	public int z;
	
	// keeps track of an obj coordinates
	public Point3D (int x, int y, int z) {
		// "super" refers to the current obj superclass Point
		super(x, y);
		// "this" is used to access the current Point3D obj
		this.z = z;
	}
	
	// places a point at the specified location
	public void move (int x, int y, int z) {
		this.z = z;
		super.move(x, y);
	}
	
	// move an obj an amount of x and y values
	public void translate (int x, int y, int z) {
		this.z += z;
		super.translate(x, y);
	}
}


