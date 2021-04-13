package com.study.design.adapter.eobject;

import com.study.design.adapter.Electronic110V;

public class Hairdryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("hairDryer power on though 110V");
    }
}
