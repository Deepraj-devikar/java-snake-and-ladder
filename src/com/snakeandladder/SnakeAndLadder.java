package com.snakeandladder;

import com.snakeandladder.SnakeAndLadderGame;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder problem");
		SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame();
		System.out.println("Player roll dice and got "+snakeAndLadderGame.dice());
	}

}
