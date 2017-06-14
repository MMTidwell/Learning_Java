package com.activities;

public class Blocker extends FootballPlayer {
	public void block(FootballPlayer p) {
		// prints out which player blocked another player
		// "this" is refering to 
		System.out.println("#" + this.number + " blocks #" + p.number);
	}
}
