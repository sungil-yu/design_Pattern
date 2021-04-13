package com.study.design.adapter.eobject;

import com.study.design.adapter.Electronic220V;

public class Television implements Electronic220V {
    @Override
    public void connect() {
        System.out.println("television on through 220V");
    }
}
