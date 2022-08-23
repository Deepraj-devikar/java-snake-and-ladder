package com.snakeandladder;

public class SnakeAndLadderGame {
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static int playerPosition;
	
	SnakeAndLadderGame() {
		this.playerPosition = 0;
		System.out.println("Snake and Ladder game starts player position is "+this.playerPosition);
	}
	
	public int dice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}
	
	public void play() {
		int crrDice = this.dice();
		int playOption = (int) Math.floor(Math.random() * 10) % 3;
		switch (playOption) {
			case LADDER:
				System.out.println("Play option is Ladder the player moves ahead by the "+crrDice+" number of position");
				break;
			case SNAKE:
				System.out.println("Play option is Snake the player moves behind by the "+crrDice+" number of position");
				break;
			default:
				System.out.println("Play option is No Play the player stays in the same position");
		}
	}
	
	
}
