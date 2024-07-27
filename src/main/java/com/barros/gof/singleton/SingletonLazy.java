package com.barros.gof.singleton;

/**
 * Lazy Singleton
 *
 * @author Barros313
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
