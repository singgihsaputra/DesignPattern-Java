package com.singgih.proxypattern.protectionproxy;

import java.lang.reflect.Proxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class NewsAccess {

    public static News getNewsWriter(News news){
        return (News) Proxy.newProxyInstance(
                news.getClass().getClassLoader(),
                news.getClass().getInterfaces(),
                new NewsWriter(news));
    };

    public static News getNewsReader(News news){
        return (News) Proxy.newProxyInstance(
                news.getClass().getClassLoader(),
                news.getClass().getInterfaces(),
                new NewsReader(news));
    };
}
