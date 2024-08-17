package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("Fire up");
    }
    
    public void down() {
        System.out.println("Lie down");
    }
    
    public void right() {
        System.out.println("Go right contra");
    }
    
    public void left() {
        System.out.println("Go left contra");
    }
}
