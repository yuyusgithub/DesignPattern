package com.yuyu.decoratorPattern;

/**
 *
 * 添加巧克力，需要0.2美元
 *
 * Created by 彦祖 .
 */
public class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 巧克力";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
