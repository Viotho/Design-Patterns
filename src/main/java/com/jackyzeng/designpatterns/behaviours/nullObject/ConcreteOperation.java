package com.jackyzeng.designpatterns.behaviours.nullObject;

public class ConcreteOperation extends AbstractOperation {
    @Override
    void request() {
        System.out.println("Do Something.");
    }
}
