package com.jackyzeng.designpatterns.creatings.singleton;

import java.util.Objects;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleCheckSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
