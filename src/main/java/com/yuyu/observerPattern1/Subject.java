package com.yuyu.observerPattern1;

/**
 * Created by 彦祖 .
 */
public interface Subject {

    /**
     * 注册 观察者
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除  观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知所有的  观察者
     */
    void notifyObservers();
}
