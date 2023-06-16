package com.jackyzeng.designpatterns.behaviours.mediator;

public class ColleagueA extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent(EventType.EventTypeA);
    }

    public void doEventA() {
        System.out.println("doEventA()");
    }
}
