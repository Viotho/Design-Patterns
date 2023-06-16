package com.jackyzeng.designpatterns.behaviours.nullObject;

public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation = function(-1);
        abstractOperation.request();
    }

    public static AbstractOperation function(int param) {
        if (param < 0) {
            return new NullOperation();
        }
        return new ConcreteOperation();
    }
}
