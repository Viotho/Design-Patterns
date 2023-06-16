package com.jackyzeng.designpatterns.behaviours.mediator;

public class DefaultColleague extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EventType.DefaultType);
    }

    public void doDefaultEvent() {
        System.out.println("doDefaultEvent()");
    }
}
