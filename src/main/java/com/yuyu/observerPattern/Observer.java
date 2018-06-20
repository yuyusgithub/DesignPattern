package com.yuyu.observerPattern;

/**
 * Created by 彦祖 .
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
