package com.singgih.proxypattern.virtualproxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class Main {

    public static void main(String[] args) {
        NewsProxy newsProxy = new NewsProxy();
        newsProxy.showNews();
    }
}
