package com.jackyzeng.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractComponent {

    private List<Component> children;

    public Composite(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("Composite:" + name);
        for (Component component : children) {
            component.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }
}