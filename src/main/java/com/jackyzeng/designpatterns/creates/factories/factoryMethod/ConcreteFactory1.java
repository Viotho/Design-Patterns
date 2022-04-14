package com.jackyzeng.designpatterns.creates.factories.factoryMethod;

import com.jackyzeng.designpatterns.creates.factories.ConcreteProduct1;
import com.jackyzeng.designpatterns.creates.factories.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
