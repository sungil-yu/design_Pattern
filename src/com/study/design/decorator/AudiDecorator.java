package com.study.design.decorator;

public class AudiDecorator implements ICar {

    protected int modelPrice;
    protected ICar audi;
    protected String modelName;

    public AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }


    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "가격은 "+ getPrice() + "원 입니다.");
    }
}
