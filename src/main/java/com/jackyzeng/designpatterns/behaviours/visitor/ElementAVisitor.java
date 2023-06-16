package com.jackyzeng.designpatterns.behaviours.visitor;

public interface ElementAVisitor extends VisitorMarker {
    void visit(ConcreteElementA elementA);
}
