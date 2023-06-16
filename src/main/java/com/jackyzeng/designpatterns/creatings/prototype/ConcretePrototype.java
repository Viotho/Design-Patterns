package com.jackyzeng.designpatterns.creatings.prototype;

public class ConcretePrototype extends Prototype {

    private final String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype customClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return field;
    }

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("hello");
        Prototype clonedPrototype = prototype.customClone();
        System.out.println(clonedPrototype);
    }
}
