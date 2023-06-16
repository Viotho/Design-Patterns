package com.jackyzeng.designpatterns.creatings.factories.factoryMethod;

import com.jackyzeng.designpatterns.creatings.factories.ConcreteProduct1;
import com.jackyzeng.designpatterns.creatings.factories.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
