package com.singgih.proxypattern.protectionproxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class Main {

    public static void main(String[] args) {
        News newsContent = new NewsContent("Hot news today - In Jakarta, suddenly cat can fly");
        News newsReader = NewsAccess.getNewsReader(newsContent);
        System.out.println("Read : " + newsReader.getNewsContent());
        try {
            newsReader.setNewsContent("Write : This is fake news");
        } catch (Exception e) {
            System.out.println("Write : You don't have authority to re-write the news");
        }

        System.out.println();
        News newsWriter = NewsAccess.getNewsWriter(newsContent);
        System.out.println("Read : " + newsWriter.getNewsContent());
        newsWriter.setNewsContent("Hot news today - The news about cat can fly is hoax");
        System.out.println("Read : " + newsWriter.getNewsContent());
    }
}
