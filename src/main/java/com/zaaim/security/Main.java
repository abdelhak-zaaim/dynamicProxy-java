package com.zaaim.security;

import com.zaaim.*;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service realService = new RealService();

        Service securityProxy = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new SecurityProxy(realService));

        securityProxy.serve();
    }
}
