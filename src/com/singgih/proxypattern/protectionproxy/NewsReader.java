package com.singgih.proxypattern.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by singgihrs on 5/21/17.
 */
public class NewsReader implements InvocationHandler {

    public News news;

    public NewsReader(News news) {
        this.news = news;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(news, args);
        } else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
