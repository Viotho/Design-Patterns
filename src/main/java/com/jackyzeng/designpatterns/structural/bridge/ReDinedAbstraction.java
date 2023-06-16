package com.jackyzeng.designpatterns.structural.bridge;

public class ReDinedAbstraction extends Abstraction {

    public ReDinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operationImpl();
    }
}
