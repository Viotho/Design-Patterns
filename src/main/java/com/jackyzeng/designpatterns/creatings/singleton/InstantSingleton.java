package com.jackyzeng.designpatterns.creatings.singleton;

public class InstantSingleton {

    private static final InstantSingleton INSTANCE = new InstantSingleton();

    private InstantSingleton() {
    }

    public InstantSingleton getInstance() {
        return INSTANCE;
    }
}
