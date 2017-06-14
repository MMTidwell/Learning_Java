package com.activities;

public class BallCarrier extends FootballPlayer {
	public void run() {
		System.out.println("#" + this.number + " runs with the ball.");
	}
	
	public void catchBall() {
		System.out.println("#" + this.number + " catches the ball.");
	}
}
