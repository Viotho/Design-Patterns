package com.jackyzeng.designpatterns.behaviours.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehaviour(new Quack());
        duck.performQuack();

        duck.setQuackBehaviour(new Squeak());
        duck.performQuack();
    }
}
