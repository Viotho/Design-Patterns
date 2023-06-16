package com.jackyzeng.designpatterns.behaviours.observers;

public class ConcreteObserver implements Observer {

    public ConcreteObserver(ConcreteSubject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String data) {
        System.out.println(data);
    }
}
