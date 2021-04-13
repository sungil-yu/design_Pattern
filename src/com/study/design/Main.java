package com.study.design;

import com.study.design.adapter.Adapter;
import com.study.design.adapter.eobject.AirConditioner;
import com.study.design.adapter.Electronic110V;
import com.study.design.adapter.eobject.Hairdryer;

public class Main {

    public static void main(String[] args) {

//        AClazz aClazz = new AClazz();
//
//        BClazz bClazz = new BClazz();
//
//        SocketClient Asocket = aClazz.getSocketClient();
//        SocketClient Bsocket = bClazz.getSocketClient();
//        System.out.println(Asocket.equals(Bsocket));

        Hairdryer hairdryer = new Hairdryer();
        connect(hairdryer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new Adapter(airConditioner);
        connect(adapter);

    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
