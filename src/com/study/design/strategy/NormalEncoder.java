package com.study.design.strategy;

public class NormalEncoder implements EncoderStrategy {


    @Override
    public String encode(String msg) {
        return msg;
    }
}
