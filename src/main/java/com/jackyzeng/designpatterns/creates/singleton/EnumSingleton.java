package com.jackyzeng.designpatterns.creates.singleton;

public enum EnumSingleton {
    INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        EnumSingleton firstInstance = EnumSingleton.INSTANCE;
        firstInstance.setValue("Hi");
        System.out.println(firstInstance.getValue());
        EnumSingleton secondInstance = EnumSingleton.INSTANCE;
        secondInstance.setValue("Hello");
        System.out.println(firstInstance.getValue());
        System.out.println(secondInstance.getValue());

        try {
            EnumSingleton[] enumConstants = EnumSingleton.class.getEnumConstants();
            for (EnumSingleton enumConstant : enumConstants) {
                System.out.println(enumConstant.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
