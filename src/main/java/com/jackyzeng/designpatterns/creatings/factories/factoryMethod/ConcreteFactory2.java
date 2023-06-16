package com.jackyzeng.designpatterns.creatings.factories.factoryMethod;

import com.jackyzeng.designpatterns.creatings.factories.ConcreteProduct2;
import com.jackyzeng.designpatterns.creatings.factories.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
