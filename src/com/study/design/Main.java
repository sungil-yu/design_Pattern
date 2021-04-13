package com.study.design;

import com.study.design.singleton.AClazz;
import com.study.design.singleton.BClazz;
import com.study.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();

        BClazz bClazz = new BClazz();

        SocketClient Asocket = aClazz.getSocketClient();
        SocketClient Bsocket = bClazz.getSocketClient();


        System.out.println(Asocket.equals(Bsocket));

    }
}
