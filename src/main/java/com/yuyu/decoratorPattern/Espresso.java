package com.yuyu.decoratorPattern;

import com.yuyu.decoratorPattern.Beverage;

/**
 *
 * 意式浓缩 coffee
 *
 * Created by 彦祖 .
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
