package com.yuyu.singleton;

/**
 * Created by 彦祖 .
 * 线程安全，但是效率很低，getInstence方法是同步的，一般不这么用
 */
public class LazySafe {

    private static LazySafe instance;
    private LazySafe (){}
    public static synchronized LazySafe getInstance() {
        if (instance == null) {
            instance = new LazySafe();
        }
        return instance;
    }
}
