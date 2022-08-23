package com.snakeandladder;

public class SnakeAndLadderGame {
	public static int playerPosition;
	
	SnakeAndLadderGame() {
		this.playerPosition = 0;
		System.out.println("Snake and Ladder game starts player position is "+this.playerPosition);
	}
	
	public int dice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}
}
