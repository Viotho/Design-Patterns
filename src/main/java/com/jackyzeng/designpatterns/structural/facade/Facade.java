package com.jackyzeng.designpatterns.structural.facade;

public class Facade {
    private SubSystem subSystem;

    public Facade(SubSystem subSystem) {
        this.subSystem = subSystem;
    }

    public void steps() {
        subSystem.stepA();
        subSystem.stepB();
        subSystem.stepC();
    }
}
