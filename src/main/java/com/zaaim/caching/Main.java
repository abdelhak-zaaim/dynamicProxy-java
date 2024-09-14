package com.zaaim.caching;

import com.zaaim.*;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service realService = new RealService();

        Service cachingProxy = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new CachingProxy(realService));

        cachingProxy.serve();
    }
}