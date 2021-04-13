package com.study.design;

import com.study.design.adapter.Electronic110V;
import com.study.design.aop.AopBrowser;
import com.study.design.proxy.Browser;
import com.study.design.proxy.CacheBrowser;
import com.study.design.proxy.Ibrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {


    public static void main(String[] args) {

        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();

        Ibrowser cacheBrowser = new CacheBrowser("www.yahoo.com");
        cacheBrowser.show();
        cacheBrowser.show();


        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();


        Ibrowser AOPIbrowser = new AopBrowser("www.google.com",
                ()-> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{

                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
                );


        AOPIbrowser.show();
        System.out.println("consume Time : " + end.get());
        AOPIbrowser.show();
        System.out.println("consume Time : " + end.get());


/*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();
        SocketClient Asocket = aClazz.getSocketClient();
        SocketClient Bsocket = bClazz.getSocketClient();
        System.out.println(Asocket.equals(Bsocket));
        Hairdryer hairdryer = new Hairdryer();
        connect(hairdryer);
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new Adapter(airConditioner);
        connect(adapter);
*/



    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
