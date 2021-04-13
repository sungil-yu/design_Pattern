package com.study.design.proxy;

public class CacheBrowser implements Ibrowser {

    private String url;
    private Html html;

    public CacheBrowser(String url){
        this.url = url;
    }


    @Override
    public Html show() {

        if (html == null){
            System.out.println("create response html  from : " + url);
            this.html = new Html(url);
            return html;
        }

        System.out.println("cache response html from : "+ url);
        return html;
    }
}
