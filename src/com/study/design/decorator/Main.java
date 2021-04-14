package com.study.design.decorator;

public class Main {


    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audiA3 = new AudiA3(audi,"A3",1000);
        audiA3.showPrice();

        ICar audiA4 = new AudiA4(audi,"A4",2000);
        audiA4.showPrice();

        ICar audiA5 = new AudiA5(audi,"A5",3000);
        audiA5.showPrice();

    }
}
