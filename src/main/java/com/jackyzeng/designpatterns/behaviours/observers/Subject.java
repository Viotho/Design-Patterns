package com.jackyzeng.designpatterns.behaviours.observers;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObservers(Observer observer);

    void notifyObservers();
}
