package com.activities;

public class Lineman extends Blocker {
	// Inherits FootballPlayer from the Blocker class
	public void hold(FootballPlayer p) {
		System.out.println("#" + this.number + " holds " + p.number);
	}
}
