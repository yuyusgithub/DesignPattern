package com.yuyu.decoratorPattern;

/**
 * 首选咖啡
 *
 * Created by 彦祖 .
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
