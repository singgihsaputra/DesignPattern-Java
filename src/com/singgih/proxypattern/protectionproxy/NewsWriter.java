package com.singgih.proxypattern.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by singgihrs on 5/21/17.
 */
public class NewsWriter implements InvocationHandler {

    public News news;

    public NewsWriter(News news) {
        this.news = news;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(news, args);
    }
}
