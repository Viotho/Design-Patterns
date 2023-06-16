package com.jackyzeng.designpatterns.behaviours.mediator;

public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;

    private ColleagueB colleagueB;

    private DefaultColleague defaultColleague;

    public ConcreteMediator(ColleagueA colleagueA, ColleagueB colleagueB, DefaultColleague defaultColleague) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
        this.defaultColleague = defaultColleague;
    }

    @Override
    public void doEvent(EventType eventType) {
        switch (eventType) {
            case EventTypeA:
                doEventA();
                break;
            case EventTypeB:
                doEventB();
                break;
            default:
                doDefaultEvent();
        }
    }

    public void doEventA() {
        colleagueA.doEventA();
    }

    public void doEventB() {
        colleagueB.doEventB();
    }

    public void doDefaultEvent() {
        defaultColleague.doDefaultEvent();
    }

}
