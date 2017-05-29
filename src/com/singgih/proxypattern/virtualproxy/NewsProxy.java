package com.singgih.proxypattern.virtualproxy;

/**
 * Created by singgihrs on 5/21/17.
 */
public class NewsProxy implements NewsContract {

    boolean alreadyLoaded;

    News news;

    @Override
    public void showNews() {
        if(alreadyLoaded){
            news.showNews();
        }else{
            System.out.println("Loading news today, Please wait. . .");
            news = new News();
            news.showNews();
            alreadyLoaded = true;
        }
    }
}
