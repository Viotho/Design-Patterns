package com.jackyzeng.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweights(String internalState) {
        if (!flyweights.containsKey(internalState)) {
            Flyweight flyweight = new ConcreteFlyweight(internalState);
            flyweights.put(internalState, flyweight);
        }
        return flyweights.get(internalState);
    }
}
