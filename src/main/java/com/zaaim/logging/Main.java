package com.zaaim.logging;

import com.zaaim.*;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service realService = new RealService();

        Service loggingProxy = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new LoggingProxy(realService));

        loggingProxy.serve();
    }
}