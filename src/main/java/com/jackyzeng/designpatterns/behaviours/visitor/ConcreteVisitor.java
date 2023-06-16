package com.jackyzeng.designpatterns.behaviours.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting Element A...");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting Element B...");
    }

    @Override
    public void visit(ConcreteElementC elementC) {
        System.out.println("Visiting Element C...");
    }
}
