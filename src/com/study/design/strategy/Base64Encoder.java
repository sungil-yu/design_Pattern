package com.study.design.strategy;

import java.util.Base64;

public class Base64Encoder implements EncoderStrategy {


    @Override
    public String encode(String msg) {

        return Base64.getEncoder().encodeToString(msg.getBytes());
    }

}
