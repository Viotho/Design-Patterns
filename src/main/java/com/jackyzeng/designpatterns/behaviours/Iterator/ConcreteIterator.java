package com.jackyzeng.designpatterns.behaviours.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {

    private  T[] elements;

    private int position = 0;

    public ConcreteIterator(T[] elements) {
        this.elements = elements;
    }

    @Override
    public T next() {
        return elements[position++];
    }

    @Override
    public boolean hasNext() {
        return position < elements.length;
    }
}
