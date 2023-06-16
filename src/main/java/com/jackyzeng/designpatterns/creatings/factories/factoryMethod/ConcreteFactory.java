package com.jackyzeng.designpatterns.creatings.factories.factoryMethod;

import com.jackyzeng.designpatterns.creatings.factories.ConcreteProduct;
import com.jackyzeng.designpatterns.creatings.factories.Product;

public class ConcreteFactory extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
