package com.jackyzeng.designpatterns.creatings.builder.hierarchicalBuilder;

public abstract class AbstractProduct {
    private final int field1;
    private final int field2;

    abstract static class Builder<T extends Builder<T>> {
        private int field1;
        private int field2;

        public T field1(int value) {
            this.field1 = value;
            return self();
        }

        public T field2(int value) {
            this.field2 = value;
            return self();
        }

        abstract AbstractProduct build();

        protected abstract T self();
    }

    AbstractProduct(Builder<?> builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
    }
}
