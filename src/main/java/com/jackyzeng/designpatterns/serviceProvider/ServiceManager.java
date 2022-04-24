package com.jackyzeng.designpatterns.serviceProvider;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

// 服务访问Api
public class ServiceManager {

    private ServiceManager() {}

    public static final Map<String, ServiceProvider> providers = new ConcurrentHashMap<>();

    public static void registerService(String serviceName, ServiceProvider serviceProvider) {
        providers.put(serviceName, serviceProvider);
    }

    public static CustomService getService(String serviceName) {
        ServiceProvider serviceProvider = providers.get(serviceName);
        if (Objects.isNull(serviceProvider)) {
            throw new IllegalArgumentException("no provider registered with name = " + serviceName);
        }
        return serviceProvider.getCustomService();
    }
}
