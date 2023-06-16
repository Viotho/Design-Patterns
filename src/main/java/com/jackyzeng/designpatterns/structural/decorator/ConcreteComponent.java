package com.jackyzeng.designpatterns.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Component: Do something...");
    }
}
