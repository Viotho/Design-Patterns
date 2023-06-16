package com.jackyzeng.designpatterns.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String internalState;

    public ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }

    @Override
    public void operation(String externalState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("InternalState: " + internalState);
        System.out.println("ExternalState: " + externalState);
    }
}
