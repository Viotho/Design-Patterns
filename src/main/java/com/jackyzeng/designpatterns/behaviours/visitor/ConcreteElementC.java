package com.jackyzeng.designpatterns.behaviours.visitor;

public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(VisitorMarker visitor) {
        ElementCVisitor v = (ElementCVisitor) visitor;
        v.visit(this);
    }
}
