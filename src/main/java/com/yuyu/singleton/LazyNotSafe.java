package com.yuyu.singleton;

/**
 * Created by 彦祖 .
 * 懒汉式  线程不安全
 */
public class LazyNotSafe {

    private static LazyNotSafe instance;
    private LazyNotSafe (){}

    public static LazyNotSafe getInstance() {
        if (instance == null) {
            instance = new LazyNotSafe();
        }
        return instance;
    }
}
