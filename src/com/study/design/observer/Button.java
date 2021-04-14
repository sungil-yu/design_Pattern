package com.study.design.observer;

public class Button {

    private String name;
    private IEventListener eventListener;

    public Button(String name) {
        this.name = name;
    }

    public void addEventListener(IEventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void click(String message) {
        eventListener.clickListen(message);
    }



}
