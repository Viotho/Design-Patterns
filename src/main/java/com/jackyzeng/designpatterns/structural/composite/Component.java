package com.jackyzeng.designpatterns.structural.composite;

public interface Component {
    void print(int level);

    void add(Component component);

    void remove(Component component);

}
