package com.jackyzeng.designpatterns.structural.bridge;

public class ConcreteImplementor implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("Do something...");
    }
}
