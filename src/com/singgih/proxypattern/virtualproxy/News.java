package com.singgih.proxypattern.virtualproxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class News implements NewsContract {
    @Override
    public void showNews() {
        try {
            Thread.sleep(2000);
            System.out.println("News today - Kotlin is new official programming for Android Native");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
