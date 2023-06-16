package com.jackyzeng.designpatterns.creatings.builder.simpleBuilder;

public class Product {
    private final int field1;
    private final int field2;
    private final int field3;
    private final int field4;

    private Product(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
    }

    public static class Builder {
        private int field1;
        private int field2;
        private int field3;
        private int field4;

        public Builder() {

        }

        public Builder field1(int value) {
            this.field1 = value;
            return this;
        }

        public Builder field2(int value) {
            this.field2 = value;
            return this;
        }

        public Builder field3(int value) {
            this.field3 = value;
            return this;
        }

        public Builder field4(int value) {
            this.field4 = value;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
