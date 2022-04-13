package com.jackyzeng.designpatterns.creates.factories.simpleFactory;

public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        } else {
            return new ConcreteProduct();
        }
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        System.out.println(product);
    }
}
