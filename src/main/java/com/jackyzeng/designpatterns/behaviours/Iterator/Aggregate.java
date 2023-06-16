package com.jackyzeng.designpatterns.behaviours.Iterator;

public interface Aggregate {
    Iterator<?> createIterator();
}
