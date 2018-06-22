package com.yuyu.strategyPattern.impl;

import com.yuyu.strategyPattern.Strategy;

/**
 * Created by 彦祖 .
 */
public class OperationMultiply implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
