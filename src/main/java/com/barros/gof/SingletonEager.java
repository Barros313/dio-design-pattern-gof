package com.barros.gof;


/**
 * Eager Singleton
 *
 * @author Barros313
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
