package com.jackyzeng.designpatterns.creatings.builder.hierarchicalBuilder;

public class ConcreteProduct extends AbstractProduct {
    private final int field3;
    private final int field4;

    private ConcreteProduct(Builder builder) {
        super(builder);
        this.field3 = builder.field3;
        this.field4 = builder.field4;
    }

    public static class Builder extends AbstractProduct.Builder<Builder> {
        private int field3;
        private int field4;

        public Builder() {
            super();
        }

        public Builder field3(int value) {
            this.field3 = value;
            return self();
        }

        public Builder field4(int value) {
            this.field4 = value;
            return self();
        }

        // 协变返回类型(covariant return typing)
        @Override
        ConcreteProduct build() {
            return new ConcreteProduct(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
