package com.barros.gof;

import com.barros.gof.strategy.*;

public class TestStrategy {
    public static void main(String[] args) {
        Behavior normalBehavior = new NormalBehavior();
        Behavior defenseBehavior = new DefenseBehavior();
        Behavior aggressiveBehavior = new AgressiveBehavior();

        Robot robot = new Robot();

        robot.setBehavior(normalBehavior);
        robot.move();

        robot.setBehavior(defenseBehavior);
        robot.move();

        robot.setBehavior(aggressiveBehavior);
        robot.move();
    }
}
