package com.barros.gof.strategy;

public class DefenseBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}
