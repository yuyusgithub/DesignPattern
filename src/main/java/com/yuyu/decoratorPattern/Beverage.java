package com.yuyu.decoratorPattern;

/**
 *
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 * Beverage  饮料类
 *
 * Created by 彦祖 .
 */
public abstract class Beverage {

    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();

}
