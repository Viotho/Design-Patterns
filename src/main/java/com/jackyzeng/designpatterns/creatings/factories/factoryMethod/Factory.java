package com.jackyzeng.designpatterns.creatings.factories.factoryMethod;

import com.jackyzeng.designpatterns.creatings.factories.Product;

public abstract class Factory {
    abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        System.out.println(product);
    }
}
