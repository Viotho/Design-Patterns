package com.jackyzeng.designpatterns.creatings.factories.abstractFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
    }
}
