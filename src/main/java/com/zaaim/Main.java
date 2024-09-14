package com.zaaim;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Service realService = new RealService();


        Service proxyService = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before invoking " + method.getName());
                        Object result = method.invoke(realService, args); // Call the real method
                        System.out.println("After invoking " + method.getName());
                        return result;
                    }
                });


        proxyService.serve();
    }
}