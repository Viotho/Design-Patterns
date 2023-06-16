package com.jackyzeng.designpatterns.structural.decorator;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Decorator: Do something...");
        component.operation();
    }
}
