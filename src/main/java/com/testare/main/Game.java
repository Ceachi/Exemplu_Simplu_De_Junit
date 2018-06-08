package com.testare.main;


/*
 * Cand scriu aici ma concentrezi doar sa fac ca testul sa treaca
 */
public class Game {

	// aici fac cat mai putine modificari
	// a.i testul sa treaca
	
	private int score;
	public void throwBall(int noOfItemsDown) {
		this.score += noOfItemsDown;
	}
	
	public int getScore() {
		return this.score;
	}
}
