package com.jackyzeng.designpatterns.behaviours.visitor;

public interface Visitor {
    void visit(ConcreteElementA elementA);

    void visit(ConcreteElementB elementB);

    void visit(ConcreteElementC elementC);
}
