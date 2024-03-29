package com.jackyzeng.designpatterns.behaviours.serviceProvider;

// 服务实现类
public class CustomServiceImpl implements CustomService {

    @Override
    public void customMethod() {
        System.out.println("Hello");
    }

    @Override
    public void anotherCustomMethod() {
        System.out.println("Goodbye");
    }
}
