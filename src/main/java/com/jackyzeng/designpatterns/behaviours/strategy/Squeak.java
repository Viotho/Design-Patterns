package com.jackyzeng.designpatterns.behaviours.strategy;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
