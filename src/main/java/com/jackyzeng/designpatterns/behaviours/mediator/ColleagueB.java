package com.jackyzeng.designpatterns.behaviours.mediator;

public class ColleagueB extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EventType.EventTypeB);
    }

    public void doEventB() {
        System.out.println("doEventB()");
    }
}
