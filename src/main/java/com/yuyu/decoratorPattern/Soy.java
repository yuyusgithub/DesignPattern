package com.yuyu.decoratorPattern;

/**
 * Created by 彦祖 .
 */
public class Soy  extends CondimentDecorator  {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆奶";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
