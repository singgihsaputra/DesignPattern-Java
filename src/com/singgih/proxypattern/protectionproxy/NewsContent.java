package com.singgih.proxypattern.protectionproxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class NewsContent implements News {

    String newsContent;

    public NewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public String getNewsContent() {
        return newsContent;
    }

    @Override
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
