package com.yuyu.singleton;

/**
 * Created by 彦祖 .
 */
public class Hungary {

    private static Hungary instance = new Hungary();
    private Hungary (){}
    public static Hungary getInstance() {
        return instance;
    }
}
