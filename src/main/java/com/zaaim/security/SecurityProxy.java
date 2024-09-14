package com.zaaim.security;

import com.zaaim.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {
    private final Object target;

    public SecurityProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (checkAccess()) {
            return method.invoke(target, args);
        } else {
            throw new SecurityException("Access denied to method " + method.getName());
        }
    }

    private boolean checkAccess() {
        // Implement your security check logic here
        return true;
    }
}