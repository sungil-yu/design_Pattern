package com.study.design.adapter.eobject;

import com.study.design.adapter.Electronic220V;

public class AirConditioner implements Electronic220V {
    @Override
    public void connect() {

        System.out.println("AirConditioner on thought 220V");

    }
}
