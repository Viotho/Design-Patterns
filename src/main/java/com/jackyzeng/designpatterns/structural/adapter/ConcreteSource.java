package com.jackyzeng.designpatterns.structural.adapter;

public class ConcreteSource implements Source {
    @Override
    public void sourceMethod() {
        System.out.println("Hello from source.");
    }
}
