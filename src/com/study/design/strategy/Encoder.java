package com.study.design.strategy;

public class Encoder {

    private EncoderStrategy strategy;
    private String msg;

    public Encoder(String msg) {
        this.msg = msg;
    }

    public void setStrategy(EncoderStrategy strategy) {
        this.strategy = strategy;
    }

    public String getMsg() {
        return strategy.encode(msg);
    }
}
