package com.barros.gof;

import com.barros.gof.singleton.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Lazy");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("Testing Singleton Eager");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("Testing Singleton Lazy Holder");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
