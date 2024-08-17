package com.in28minutes.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
        System.out.println("Fire up pacman");
    }
    
    public void down() {
        System.out.println("Lie down pacman");
    }
    
    public void right() {
        System.out.println("Go right pacman");
    }
    
    public void left() {
        System.out.println("Go left pacman");
    }
}
