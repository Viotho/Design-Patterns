package com.jackyzeng.designpatterns.serviceProvider;

// 服务实现类
public class CustomServiceImpl implements CustomService{

    @Override
    public void customMethod() {
        System.out.println("Hello");
    }

    @Override
    public void customMethod1() {
        System.out.println("Goodbye");
    }
}
