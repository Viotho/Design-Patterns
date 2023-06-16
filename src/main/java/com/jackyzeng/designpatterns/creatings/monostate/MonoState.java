package com.jackyzeng.designpatterns.creatings.monostate;

public class MonoState {
    private static int field;

    public static int getField() {
        return field;
    }

    public static void setField(int field) {
        MonoState.field = field;
    }
}
