package com.jackyzeng.designpatterns.creates.factories.factoryMethod;

import com.jackyzeng.designpatterns.creates.factories.ConcreteProduct;
import com.jackyzeng.designpatterns.creates.factories.Product;

public class ConcreteFactory extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
