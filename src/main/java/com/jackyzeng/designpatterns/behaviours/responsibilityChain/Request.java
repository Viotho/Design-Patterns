package com.jackyzeng.designpatterns.behaviours.responsibilityChain;

public class Request {

    private RequestType type;
    private String name;


    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }


    public RequestType getType() {
        return type;
    }


    public String getName() {
        return name;
    }

    public enum RequestType {
        TYPE1, TYPE2
    }
}
