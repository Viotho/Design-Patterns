package com.jackyzeng.designpatterns.creatings.singleton;

public class InnerStaticSingleton {
    private InnerStaticSingleton() {}

    public static class SingletonHolder{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
