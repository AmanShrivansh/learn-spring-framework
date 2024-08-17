package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingCOnfiguration {
    @Bean
    public GamingConsole game() {
    	var game = new PacmanGame();
    	return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) { 
    	var gameRunner = new GameRunner(game);
    	return gameRunner;
    }
    
    
	/*var game = new PacmanGame(); //1.Obj creation
	//var game = new MarioGame();
	//var game = new SuperContraGame();
	var gameRunner = new GameRunner(game); 
	
	//2. Obj creation of game runner class + wiring of dependency
	//game is a dependency of GameRunner Class
	gameRunner.run();*/
}
