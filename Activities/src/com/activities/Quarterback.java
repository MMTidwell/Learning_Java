package com.activities;

public class Quarterback extends FootballPlayer{
	public void pass (FootballPlayer p) {
		System.out.println("#" + this.number + " passes the ball to #" + p.number);
	}
}
