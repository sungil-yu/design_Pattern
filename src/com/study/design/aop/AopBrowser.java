package com.study.design.aop;

import com.study.design.proxy.Html;
import com.study.design.proxy.Ibrowser;

public class AopBrowser implements Ibrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;


    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {

        before.run();

        if(html == null){
            System.out.println("create AOP Browser response");
            this.html = new Html(url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        after.run();
        System.out.println("cache AOP Browser response");
        return html;
    }
}
