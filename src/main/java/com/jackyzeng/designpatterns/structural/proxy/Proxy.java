package com.jackyzeng.designpatterns.structural.proxy;

public class Proxy implements Interface {

    private Implementation implementation;

    public Proxy(Implementation implementation) {
        this.implementation = implementation;
    }

    @Override
    public void operation() {
        implementation.operation();
    }
}
