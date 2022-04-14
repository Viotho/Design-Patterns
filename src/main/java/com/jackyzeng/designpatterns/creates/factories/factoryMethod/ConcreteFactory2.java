package com.jackyzeng.designpatterns.creates.factories.factoryMethod;

import com.jackyzeng.designpatterns.creates.factories.ConcreteProduct2;
import com.jackyzeng.designpatterns.creates.factories.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
