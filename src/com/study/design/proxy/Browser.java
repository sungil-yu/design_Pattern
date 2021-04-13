package com.study.design.proxy;

public class Browser implements Ibrowser {

    private String url;
    private Html html;


    public Browser(String url) {
        this.url = url;
    }


    @Override
    public Html show() {
        System.out.println("loading html from " + url);
        return new Html(url);
    }
}
