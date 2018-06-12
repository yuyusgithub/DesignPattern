package com.yuyu.singleton;

/**
 * Created by 彦祖 .
 * double check 的目的是什么？
 * 见下面，第一次和第二次
 */
public class DoubleCheck {

    private volatile static DoubleCheck singleton;
    private DoubleCheck (){}
    public static DoubleCheck getSingleton() {
        //第一次的目的是为了不让每一次请求都进入同步模块
        if (singleton == null) {
            synchronized (DoubleCheck.class) {
                //第二次是在同步的方法内部进行是否为空的检查，以保证吃能生成一个唯一的实例
                if (singleton == null) {
                    singleton = new DoubleCheck();
                }
            }
        }
        return singleton;
    }
}
