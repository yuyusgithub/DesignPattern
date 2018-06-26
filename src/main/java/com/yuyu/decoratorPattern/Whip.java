package com.yuyu.decoratorPattern;

/**
 *
 * 奶泡
 *
 * Created by 彦祖 .
 */
public class Whip   extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶泡";
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }
}
