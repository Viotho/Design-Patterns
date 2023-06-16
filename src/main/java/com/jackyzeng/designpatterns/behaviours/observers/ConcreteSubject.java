package com.jackyzeng.designpatterns.behaviours.observers;

import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer>  observers;

    private String data;

    public ConcreteSubject(List<Observer> observers) {
        this.observers = observers;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}
