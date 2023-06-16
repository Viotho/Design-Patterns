package com.jackyzeng.designpatterns.behaviours.Iterator;

import com.jackyzeng.designpatterns.structural.proxy.Interface;

public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate() {
        this.items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator<?> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
