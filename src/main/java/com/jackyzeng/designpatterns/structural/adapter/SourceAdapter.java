package com.jackyzeng.designpatterns.structural.adapter;

public class SourceAdapter implements Target {

    private Source source;

    public SourceAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void targetMethod() {
        source.sourceMethod();
    }

    public static void main(String[] args) {
        ConcreteSource concreteSource = new ConcreteSource();
        Target adaptedSource = new SourceAdapter(concreteSource);
        adaptedSource.targetMethod();
    }
}
