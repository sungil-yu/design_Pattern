package com.study.design.observer;

public class Main {

    public static void main(String[] args) {

        Button button = new Button("insert BTN");


        button.addEventListener(System.out::println);
        
        button.click("click event 발생 1");
        button.click("click event 발생 2");
        button.click("click event 발생 3");


    }
}
