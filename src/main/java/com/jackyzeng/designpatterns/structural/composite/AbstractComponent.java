package com.jackyzeng.designpatterns.structural.composite;

public abstract class AbstractComponent implements Component {
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }
}
