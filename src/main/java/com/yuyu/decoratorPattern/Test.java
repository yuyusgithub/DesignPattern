package com.yuyu.decoratorPattern;

/**
 * Created by 彦祖 .
 */
public class Test {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = beverage;
        beverage2 = new Chocolate(beverage2);
        beverage2 = new Chocolate(beverage2);
        beverage2 = new Chocolate(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Chocolate(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
