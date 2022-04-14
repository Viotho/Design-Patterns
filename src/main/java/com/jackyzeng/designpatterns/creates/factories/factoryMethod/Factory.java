package com.jackyzeng.designpatterns.creates.factories.factoryMethod;

import com.jackyzeng.designpatterns.creates.factories.Product;

public abstract class Factory {
    abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        System.out.println(product);
    }
}
