package com.yuyu.decoratorPattern;

/**
 *
 * 调味品 抽象类
 * 他继承 饮料类，不会为了获得行为或者资源，只是为了统一类型
 *
 * Created by 彦祖 .
 */
public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();

}
