package com.jackyzeng.designpatterns.behaviours.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(VisitorMarker visitor) {
        ElementAVisitor v = (ElementAVisitor) visitor;
        v.visit(this);
    }
}
