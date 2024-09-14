package com.zaaim.caching;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CachingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String key = method.getName() + (args != null ? args.toString() : "");
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }
    }
}