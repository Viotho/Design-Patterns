package com.jackyzeng.designpatterns.structural.composite;

public class Leaf extends AbstractComponent {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("left:" + name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
