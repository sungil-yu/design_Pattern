package com.study.design.strategy;

public class Main {


    public static void main(String[] args) {

        Encoder encoder = new Encoder("hello Design Pattern flower");

        //Normal
        encoder.setStrategy(new NormalEncoder());
        String normalResult = encoder.getMsg();
        System.out.println(normalResult);

        //Base64
        encoder.setStrategy(new Base64Encoder());
        System.out.println(encoder.getMsg());



    }

}
