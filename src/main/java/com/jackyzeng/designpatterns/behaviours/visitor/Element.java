package com.jackyzeng.designpatterns.behaviours.visitor;

public interface Element {
    void accept(Visitor visitor);

    void accept(VisitorMarker visitor);
}
