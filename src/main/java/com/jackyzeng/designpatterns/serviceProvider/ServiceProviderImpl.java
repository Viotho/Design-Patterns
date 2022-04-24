package com.jackyzeng.designpatterns.serviceProvider;

// 服务提供者注册Api
public class ServiceProviderImpl implements ServiceProvider {

    static {
        ServiceManager.registerService("自定义服务", new ServiceProviderImpl());
    }

    @Override
    public CustomService getCustomService() {
        return new CustomServiceImpl();
    }
}
