package com.zaaim.logging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Before invoking " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("Logging: After invoking " + method.getName());
        return result;
    }
}