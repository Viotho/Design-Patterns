package com.jackyzeng.designpatterns.behaviours.visitor;

public interface ElementBVisitor extends VisitorMarker {
    void visit(ConcreteElementB elementB);
}
