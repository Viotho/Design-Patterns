package com.jackyzeng.designpatterns.behaviours.strategy;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
