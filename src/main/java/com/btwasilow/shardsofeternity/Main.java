package com.btwasilow.shardsofeternity;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game("Shards of Eternity", 800, ((9*700/16) + 100));
		game.start();
	}
}
