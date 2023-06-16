package com.jackyzeng.designpatterns.behaviours.nullElement;

public interface Element {

    void operation();

    public static final Element NULL = new Element() {
        @Override
        public void operation() {
            // do nothing.
        }
    };
}
