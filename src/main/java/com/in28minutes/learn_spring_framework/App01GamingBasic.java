package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		var game = new PacmanGame(); //1.Obj creation
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game); 
		
		//2. Obj creation of game runner class + wiring of dependency
		//game is a dependency of GameRunner Class
		gameRunner.run();
	}

}
