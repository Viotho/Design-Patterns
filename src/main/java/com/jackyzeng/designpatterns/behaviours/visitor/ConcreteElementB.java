package com.jackyzeng.designpatterns.behaviours.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(VisitorMarker visitor) {
        ElementBVisitor v = (ElementBVisitor) visitor;
        v.visit(this);
    }
}
