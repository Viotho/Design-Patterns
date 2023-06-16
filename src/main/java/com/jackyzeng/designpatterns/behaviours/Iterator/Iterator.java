package com.jackyzeng.designpatterns.behaviours.Iterator;

public interface Iterator<T> {
    T next();

    boolean hasNext();
}
