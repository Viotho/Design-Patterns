package com.jackyzeng.designpatterns.creates.singleton;

public class InstantSingleton {

    private static final InstantSingleton INSTANCE = new InstantSingleton();

    private InstantSingleton() {
    }

    public InstantSingleton getInstance() {
        return INSTANCE;
    }
}
