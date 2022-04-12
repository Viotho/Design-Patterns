package com.jackyzeng.designpatterns.behaviours.strategy;

import java.util.Objects;

public class Duck {
    private QuackBehaviour quackBehaviour;

    public void performQuack() {
        if (Objects.nonNull(quackBehaviour)) {
            quackBehaviour.quack();
        }
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
